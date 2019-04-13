package com.blogspot.jesfre.kotlin.projects.coffeemachine.stage2

/*
Description
Now let's consider a case where you need a lot of coffee.
Maybe, for example, you’re hosting a party with a lot of guests.
The program should calculate how much water, coffee beans, and milk are necessary to make the specified amount of coffee.
One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
The user should input the amount of coffee he needs, in cups, for all the guests.

Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.
The example below shows how your output might look.

Write how many cups of coffee you will need: 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans
 */
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()

    println("For $cups cups of coffee you will need:")
    println("${cups*200} ml of water")
    println("${cups*50} ml of milk")
    println("${cups*15} g of coffee beans")

}