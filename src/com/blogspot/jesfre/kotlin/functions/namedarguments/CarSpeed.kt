package com.blogspot.jesfre.kotlin.functions.namedarguments

/*
Car speed

Write a function that calculates if the car goes at a speed exceeding the limit or not. The limit has a default value of 60 kilometers per hour.

Output "Exceeds the limit by N kilometers per hour", where N - number of kilometers per hour above the limit, otherwise output "Within the limit".

The first line of the input contains the actual speed of the car. The second line of the input contains the limit on the road. If there is no limit, the line equals "no limit". In this case, to the car should be applied the default limit.

Try to use named parameters to solve this problem.
 */
import java.util.*

fun checkSpeed(speed:Int, limit:Int=60) = if(speed > limit) println("Exceeds the limit by ${speed-limit} kilometers per hour") else println("Within the limit")

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val speedStr = scanner.nextLine()
    val limitStr = scanner.nextLine()

    if(speedStr.length==0) println(speedStr)
    if(limitStr.length==0) println(limitStr)

    val speed = speedStr.toInt()

    if(limitStr == "no limit")
        checkSpeed(speed)
    else
        checkSpeed(speed, limitStr.toInt())

}
