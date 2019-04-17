package com.blogspot.jesfre.kotlin.projects.coffeemachine.stage4

import java.util.Scanner

/*
Stage #4: Choosing different actions
Description
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee.
The coffee machine has several options:
First, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino.
Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup.

Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take".
If you want to buy some coffee, input "buy".
If you are a special worker and you think that it is time to fill out all the supplies for the coffee machine, input "fill".
If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

If the user writes "fill", the program should ask him how much water, milk, coffee beans and how many disposable cups he wants to add into the coffee machine.

If the user writes "take" the program should give him all the money that it earned from selling coffee.

At the moment, the coffee machine has $550, 1200 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s state after that.
Try to use functions for implementing every action that the coffee machine can do.

Output example
An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
Options also should be named as "buy", "fill", "take".

The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take): buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 3

The coffee machine has:
1000 of water
440 of milk
108 of coffee beans
8 of disposable cups
556 of money

The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take): fill
Write how many ml of water do you want to add: 2000
Write how many ml of milk do you want to add: 500
Write how many grams of coffee beans do you want to add: 100
Write how many disposable cups of coffee do you want to add: 10

The coffee machine has:
3200 of water
1040 of milk
220 of coffee beans
19 of disposable cups
550 of money

The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
550 of money

Write action (buy, fill, take): take
I gave you $550

The coffee machine has:
1200 of water
540 of milk
120 of coffee beans
9 of disposable cups
0 of money
 */

var availableWater = 1200
var availableMilk = 540
var availableBeans = 120
var availableCups = 9
var availableMoney = 550

fun main() {
    val scanner = Scanner(System.`in`)

    printResources()
    println()

    print("Write action (buy, fill, take): ")
    val type = scanner.nextLine()
    when(type) {
        "buy" ->{
            processBuy(scanner)
        }
        "fill" -> {
            processFill(scanner)
        }
        "take" -> {
            processTake(scanner)
        }
    }

    println()
    printResources()
}

fun printResources() {
    println("The coffee machine has:")
    println("$availableWater of water")
    println("$availableMilk of milk")
    println("$availableBeans of coffee beans")
    println("$availableCups of disposable cups")
    println("$availableMoney of money")
}

fun processBuy(scanner:Scanner) {
    val ESPRESSO = 1
    val LATTE = 2
    val CAPPUCCINO = 3
    val espressoWater = 250
    val espressoBeans = 16
    val espressoCost = 4
    val latteWater = 350
    val latteMilk = 75
    val latteBeans = 20
    val latteCost = 7
    val cappuccinoWater = 200
    val cappuccinoMilk = 100
    val cappuccinoBeans = 12
    val cappuccinoCost = 6

    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val variety = scanner.nextInt()
    // "when" is not working in hyperskill.org processor
//    when(variety) {
//        ESPRESSO -> {
//            availableWater -= espressoWater
//            availableBeans -= espressoBeans
//            availableMoney += espressoCost
//        }
//        LATTE -> {
//            availableWater -= latteWater
//            availableMilk -= latteMilk
//            availableBeans -= latteBeans
//            availableMoney += latteCost
//        }
//        CAPPUCCINO -> {
//            availableWater -= cappuccinoWater
//            availableMilk -= cappuccinoMilk
//            availableBeans -= cappuccinoBeans
//            availableMoney += cappuccinoCost
//        }
//    }
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
    availableCups--
}

fun processFill(scanner:Scanner) {
    print("Write how many ml of water do you want to add: ")
    val addWater = scanner.nextInt()

    print("Write how many ml of milk do you want to add: ")
    val addMilk = scanner.nextInt()

    print("Write how many grams of coffee beans do you want to add: ")
    val addBeans = scanner.nextInt()

    print("Write how many disposable cups of coffee do you want to add: ")
    val addCups = scanner.nextInt()

    availableWater += addWater
    availableMilk += addMilk
    availableBeans += addBeans
    availableCups += addCups
}

fun processTake(scanner:Scanner) {
    println("I gave you \$$availableMoney")
    availableMoney = 0
}