package com.blogspot.jesfre.kotlin.projects.coffeemachine.stage3

/*
Stage #3: Check if there are enough resources
Description
A real coffee machine never has an infinite supply of water, milk, or coffee beans.
And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have
the supplies needed to make all that coffee.

In this stage, you need to improve the previous program.
Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee,
the program should print "Yes, I can make that amount of coffee".
If the coffee machine can make more than that, the program should output
"Yes, I can make that amount of coffee (and even N more than that)",
where N is the number of additional cups of coffee that the coffee machine can make.
If the amount of resources is not enough to make the specified amount of coffee,
the program should output "No, I can make only N cups of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans
to make one cup of coffee.

Output example
The program should firstly request for a water, then milk, then beans, then amount of cups.

Write how many ml of water the coffee machine has: 300
Write how many ml of milk the coffee machine has: 65
Write how many grams of coffee beans the coffee machine has: 100
Write how many cups of coffee you will need: 1
Yes, I can make that amount of coffee
---
500, 250, 200, 10
No, I can make only 2 cups of coffee
---
1550, 299, 300, 3
Yes, I can make that amount of coffee (and even 2 more than that)
---
0, 0, 0, 1
No, I can make only 0 cups of coffee
---
0, 0, 0, 0
Yes, I can make that amount of coffee
---
200, 50, 15, 0
Yes, I can make that amount of coffee (and even 1 more than that)
 */

import com.blogspot.jesfre.kotlin.common.Test
import java.util.Scanner

const val WATER_BY_CUP = 200
const val MILK_BY_CUP = 50
const val BEANS_BY_CUP = 15

const val MSG_NO_OPTIONS = "Out of options!!!"
const val MSG_YES = "Yes, I can make that amount of coffee"
val MSG_YES_AND_MORE = fun(amount:Int):String {return "Yes, I can make that amount of coffee (and even $amount more than that)"}
val MSG_NO = fun(amount:Int):String {return "No, I can make only $amount cups of coffee"}

fun calculateCupsAvailable(availableWater:Int, availableMilk:Int, availableBeans:Int, requestedCups:Int) :Int {
    val cupsByWater = availableWater/ WATER_BY_CUP
    val cupsByMilk = availableMilk/ MILK_BY_CUP
    val cupsByBeans = availableBeans/ BEANS_BY_CUP

    return Math.max(Math.min(Math.min(cupsByWater, cupsByMilk), cupsByBeans), 0)
}

fun getResult(requestedCups:Int, maxCupsAvailable: Int):String {
    return when {
        maxCupsAvailable == requestedCups -> MSG_YES
        maxCupsAvailable > requestedCups -> MSG_YES_AND_MORE(maxCupsAvailable - requestedCups)
        maxCupsAvailable < requestedCups -> MSG_NO(maxCupsAvailable)
        else -> MSG_NO_OPTIONS
    }
}

fun checkResources(availableWater:Int, availableMilk:Int, availableBeans:Int, requestedCups:Int) :String {
    val maxCupsAvailable = calculateCupsAvailable(availableWater, availableMilk, availableBeans, requestedCups)
    return getResult(requestedCups, maxCupsAvailable)
}

fun main() {
    tests()
    return

    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: ")
    val availableWater = scanner.nextInt()

    print("Write how many ml of milk the coffee machine has: ")
    val availableMilk = scanner.nextInt()

    print("Write how many grams of coffee beans the coffee machine has: ")
    val availableBeans = scanner.nextInt()

    print("Write how many cups of coffee you will need: ")
    val requestedCups = scanner.nextInt()

    println(checkResources(availableWater, availableMilk, availableBeans, requestedCups))

}

fun tests() {
    var c = 1
    println("--------------- $c ------------------")
    Test.assertEquals(c++, checkResources(300, 65, 100, 1), MSG_YES)

    println("--------------- $c ------------------")
    Test.assertEquals(c++, checkResources(500, 250, 200, 10), MSG_NO(2))

    println("--------------- $c ------------------")
    Test.assertEquals(c++, checkResources(1550, 299, 300, 3), MSG_YES_AND_MORE(2))

    println("--------------- $c ------------------")
    Test.assertEquals(c++, checkResources(0, 0, 0, 1), MSG_NO(0))

    println("--------------- $c ------------------")
    Test.assertEquals(c++, checkResources(0, 0, 0, 0), MSG_YES)

    println("--------------- $c ------------------")
    Test.assertEquals(c++, checkResources(200, 50, 15, 0), MSG_YES_AND_MORE(1))

}

