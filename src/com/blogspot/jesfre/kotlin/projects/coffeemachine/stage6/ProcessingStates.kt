package com.blogspot.jesfre.kotlin.projects.coffeemachine.stage6

/*
Stage #6: Processing coffee machine states

Let's redesign our program and write a class that represents the coffee machine. The class should have a method that takes a string as input.
Every time the user inputs a line (a string) to the console, the program invokes this method with one argument: the line that user input to the console.
This system simulates pretty accurately how real-world electronic devices work.
External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.

The class should not use system input at all; it only should handle input that comes to it via this method and its string argument.

The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do?
If the user inputs a single number, how can the method determine what that number is:
a variant of coffee chosen by the user or the number of the disposable cups that a special worker added into the coffee machine?

The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in.
For example, the state could be "choosing an action" or "choosing a variant of coffee".
Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line
using the information about the current state.
After processing this line, the state of the coffee machine can be changed or can stay the same.
The most efficient way of handling states is using an enum with all predefined states.

Your coffee machine should have the the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash.

Output example
Write action (buy, fill, take, remaining, exit): remaining

The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): remaining

The coffee machine has:
50 of water
465 of milk
100 of coffee beans
8 of disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit): fill

Write how many ml of water do you want to add: 1000
Write how many ml of milk do you want to add: 0
Write how many grams of coffee beans do you want to add: 0
Write how many disposable cups of coffee do you want to add: 0

Write action (buy, fill, take, remaining, exit): remaining

The coffee machine has:
1050 of water
465 of milk
100 of coffee beans
8 of disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit): take

I gave you $564

Write action (buy, fill, take, remaining, exit): remaining

The coffee machine has:
700 of water
390 of milk
80 of coffee beans
7 of disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit): exit
 */


import java.util.Scanner

class ProcessingStates {
    val MSG_MAKING_COFFEE = "I have enough resources, making you a coffee!"

    enum class State { WAITING_ACTION, WAITING_PRODUCT_CHOICE, WAITING_WATER, WAITING_MILK, WAITING_BEANS, WAITING_CUPS }

    enum class Product(val id:String, val water:Int, val milk:Int, val beans:Int, val cost:Int) {
        ESPRESSO("1",250, 0, 16, 4),
        LATTE("2",350, 75, 20, 7),
        CAPPUCCINO("3",200, 100, 12, 6)
    }

    var availableWater = 400
    var availableMilk = 540
    var availableBeans = 120
    var availableCups = 9
    var availableMoney = 550
    var currentState = State.WAITING_ACTION

    fun entryPoint(input:String) {
        when(currentState) {
            State.WAITING_ACTION -> actionSelected(input)
            State.WAITING_PRODUCT_CHOICE -> {
                processBuy(input)
                currentState = State.WAITING_ACTION
            }
            State.WAITING_WATER -> {
                fillWater(input.toInt())
                currentState = State.WAITING_MILK
            }
            State.WAITING_MILK -> {
                fillMilk(input.toInt())
                currentState = State.WAITING_BEANS
            }
            State.WAITING_BEANS -> {
                fillBeans(input.toInt())
                currentState = State.WAITING_CUPS
            }
            State.WAITING_CUPS -> {
                fillCups(input.toInt())
                currentState = State.WAITING_ACTION
            }
        }
    }

    private fun printResources() {
        println("The coffee machine has:")
        println("$availableWater of water")
        println("$availableMilk of milk")
        println("$availableBeans of coffee beans")
        println("$availableCups of disposable cups")
        println("\$$availableMoney of money")
    }

    private fun enoughResources(requestedVariety: Product): Boolean {
        val message = when {
            availableCups < 1 -> "Sorry, not enough cups!"
            availableWater < requestedVariety.water -> "Sorry, not enough water!"
            availableMilk < requestedVariety.milk -> "Sorry, not enough milk!"
            availableBeans < requestedVariety.beans -> "Sorry, not enough beans!"
            else -> ""
        }
        if (message == "") return true
        else {
            println(message)
            return false
        }
    }

    private fun actionSelected(input:String) {
        println("Write action (buy, fill, take, remaining, exit): $input")
        when (input) {
            "buy" -> currentState = State.WAITING_PRODUCT_CHOICE
            "fill" -> currentState = State.WAITING_WATER
            "take" -> {
                processTake()
                currentState = State.WAITING_ACTION
            }
            "remaining" -> {
                printResources()
                currentState = State.WAITING_ACTION
            }
        }
    }

    private fun processBuy(input:String) {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: $input")

        if (input == "back") return

        val variety:Product = when(input) {
            Product.ESPRESSO.id ->  Product.ESPRESSO
            Product.LATTE.id ->  Product.LATTE
            else ->  Product.CAPPUCCINO
        }

        if (enoughResources(variety)) println(MSG_MAKING_COFFEE)
        else return

        availableWater -= variety.water
        availableMilk -= variety.milk
        availableBeans -= variety.beans
        availableMoney += variety.cost
        availableCups--
    }

    private fun fillWater(input:Int) {
        println("Write how many ml of water do you want to add: $input")
        availableWater += input
    }

    private fun fillMilk(input:Int) {
        println("Write how many ml of milk do you want to add: $input")
        availableMilk += input
    }

    private fun fillBeans(input:Int) {
        println("Write how many grams of coffee beans do you want to add: $input")
        availableBeans += input
    }

    private fun fillCups(input:Int) {
        println("Write how many disposable cups of coffee do you want to add: $input")
        availableCups += input
    }

    private fun processTake() {
        println("I gave you \$$availableMoney")
        availableMoney = 0
    }
}


fun main() {
    val scanner = Scanner(System.`in`)
    var exit = false

    val maker = ProcessingStates()
    do {
        println()
        val type = scanner.nextLine().trim()
        if(type == "exit") exit = true
        else {
            maker.entryPoint(type)
        }
    } while (!exit);
}