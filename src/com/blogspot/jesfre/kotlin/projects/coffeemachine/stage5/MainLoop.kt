/*
Stage #5: Creating main loop

Description
But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another.
The program should repeatedly ask what the user wants to do.
If the user types "buy", "fill" or "take", then just do what the program did in the previous step.
However, if the user wants to switch off the coffee machine, he should type "exit".
Then the program should terminate.
Also, when the user types "remaining", the program should output all the resources that the coffee machine has.

Also, do not forget that you can be out of resources for making coffee.
If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind,
he should be able to type "back" to return into the main cycle.

Your coffee machine should have the the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash.
Output example

 */
package com.blogspot.jesfre.kotlin.projects.coffeemachine.stage5

import java.util.Scanner

const val MSG_MAKING_COFFEE = "I have enough resources, making you a coffee!"
const val ESPRESSO = "1"
const val LATTE = "2"
const val CAPPUCCINO = "3"
const val BACK = "back"

const val espressoWater = 250
const val espressoBeans = 16
const val espressoCost = 4
const val latteWater = 350
const val latteMilk = 75
const val latteBeans = 20
const val latteCost = 7
const val cappuccinoWater = 200
const val cappuccinoMilk = 100
const val cappuccinoBeans = 12
const val cappuccinoCost = 6

var availableWater = 400
var availableMilk = 540
var availableBeans = 120
var availableCups = 9
var availableMoney = 550

fun main() {
    val scanner = Scanner(System.`in`)
    var exit = false

    do {
        println()

        print("Write action (buy, fill, take, remaining, exit): ")
        val type = scanner.nextLine().trim()

        println()
        when (type) {
            "buy" -> processBuy(scanner)
            "fill" -> processFill(scanner)
            "take" -> processTake(scanner)
            "remaining" -> printResources()
            "exit" -> exit = true
        }
    } while (!exit);
}

fun printResources() {
    println("The coffee machine has:")
    println("$availableWater of water")
    println("$availableMilk of milk")
    println("$availableBeans of coffee beans")
    println("$availableCups of disposable cups")
    println("\$$availableMoney of money")
}

fun enoughResources(requestedVariety:String) :Boolean {
    var reqWater = 0
    var reqMilk = 0
    var reqBeans = 0

    when(requestedVariety) {
        ESPRESSO -> {
            reqWater = espressoWater
            reqMilk = 0
            reqBeans = espressoBeans
        }
        LATTE -> {
            reqWater = latteWater
            reqMilk = latteMilk
            reqBeans = latteBeans
        }
        CAPPUCCINO -> {
            reqWater = cappuccinoWater
            reqMilk = cappuccinoMilk
            reqBeans = cappuccinoBeans
        }
    }

    val message = when {
        availableCups < 1 -> "Sorry, not enough cups!"
        availableWater < reqWater -> "Sorry, not enough water!"
        availableMilk < reqMilk -> "Sorry, not enough milk!"
        availableBeans < reqBeans -> "Sorry, not enough beans!"
        else -> ""
    }
    if(message == "") return true
    else {
        println(message)
        return false
    }
}

fun processBuy(scanner: Scanner) {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    val variety = scanner.nextLine().trim()

    if(enoughResources(variety)) println(MSG_MAKING_COFFEE)
    else return

    if(variety == ESPRESSO){
        availableWater -= espressoWater
        availableBeans -= espressoBeans
        availableMoney += espressoCost
    }
    if(variety == LATTE) {
        availableWater -= latteWater
        availableMilk -= latteMilk
        availableBeans -= latteBeans
        availableMoney += latteCost
    }
    if(variety == CAPPUCCINO) {
        availableWater -= cappuccinoWater
        availableMilk -= cappuccinoMilk
        availableBeans -= cappuccinoBeans
        availableMoney += cappuccinoCost
    }
    if(variety == BACK) {
        return
    }
    availableCups--
}

fun processFill(scanner: Scanner) {
    print("Write how many ml of water do you want to add: ")
    val addWater = scanner.nextLine().toInt()

    print("Write how many ml of milk do you want to add: ")
    val addMilk = scanner.nextLine().toInt()

    print("Write how many grams of coffee beans do you want to add: ")
    val addBeans = scanner.nextLine().toInt()

    print("Write how many disposable cups of coffee do you want to add: ")
    val addCups = scanner.nextLine().toInt()
    
    availableWater += addWater
    availableMilk += addMilk
    availableBeans += addBeans
    availableCups += addCups
}

fun processTake(scanner: Scanner) {
    println("I gave you \$$availableMoney")
    availableMoney = 0
}