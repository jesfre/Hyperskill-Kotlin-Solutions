package com.blogspot.jesfre.kotlin.stringarraysranges.ranges

/*
Between two numbers

Write a program that reads three integer numbers and prints "YES" if the first number is between the second and the third one (inclusive). Otherwise, it must print "NO". It is guaranteed that the second number is less than the third one.

Use ranges to solve the problem.
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val v = scanner.nextInt()
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if(v in a..b) println("YES")
    else println("NO")
}
