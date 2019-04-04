package com.blogspot.jesfre.kotlin.functions.namedarguments

/*
Car price

Peter wants to know how much do his car cost on the secondary market. Fortunately, there is a special site that does exactly that. When he opened site, all parameters of the car were filled by default values, and it happens to be that all parameters except one are matching with Peter's car parameters. So, he just changed one of this parameters and clicked OK. Isn't this cool?

Imagine you instead of the developer that created this function. The function should take parameters: how old is a car, how many kilometers did this car passed, what is a maximum speed of a car, does this car have an automatic transmission or not.

The common parameters are: 5 years old, passed 100000 kilometers, have a maximum speed of 160 kilometers per hour, does not have an automated transmission.

The function should work like this: starting with 20000 with every year the price of the car should be lowered by the integer part of the division 3000 / N 3000/N, where N - every year of the car. For example, for a 3-year-old car, this should be 20000 - 3000 / 1 - 3000 / 2 - 3000 / 3 = 14500 20000−3000/1−3000/2−3000/3=14500. Evaluating a maximum speed of a car, the price should be lowered by 100 for every kilometer per hour less than 120 and increased by 100 for every kilometer per hour greater than 120. Evaluating a total number of kilometers the car passed, the price should be lowered by 200 for every 10000 kilometers that car passed. For example, for 19999 kilometers the price should be lowered by 200, but for 20000 kilometers the price should be lowered by 400. Also, if the car has an automated transmission, the price of the car should be increased by 1500, otherwise stay the same.

The first line of the input contains the parameter that Peter changed - "old" for the age of the car, "passed" for kilometers that this car passed, "speed" for the maximum speed of the car, "automated transmission", for an automated transmission. Next line contains a single integer number - value of a parameter. For the parameter "automated transmission" 1 means that car has an automated transmission and 0 means that car has a manual transmission.

Output how much the car is priced on a secondary market.

Try to use named parameters to solve this problem.
 */
import java.util.*

fun getPrice(old:Int=5, passed:Int=100_000, speed:Int=160, auto:Int=0):Int {
    val DEF_SPEED = 120

    var price = 20000
    var ageDiscount = 0
    for(i in 1..old) {
        ageDiscount += 3000/i
    }

    val speedDiscount = (speed-DEF_SPEED) * -100
    val passDiscount = passed/10000*200
    var autoDiscount = 0
    if(auto==1) autoDiscount = -1500

    price -= ageDiscount
    price -= speedDiscount
    price -= passDiscount
    price -= autoDiscount

    return price
}

fun main(args: Array<String>) {
    /*
    println(getPrice(old=6)) // 14650
    println(getPrice(passed=150_000)) // 14150
    println(getPrice(speed=90)) // 8150
    println(getPrice(auto=1)) // 16650
    return
    */

    val scanner = Scanner(System.`in`)
    val param = scanner.nextLine().trim()
    val vStr = scanner.nextLine().trim()

    val value = vStr.toInt()
    when(param) {
        "old" -> println(getPrice(old=value))
        "passed" -> println(getPrice(passed=value))
        "speed" -> println(getPrice(speed=value))
        else -> println(getPrice(auto=value))
    }

}
