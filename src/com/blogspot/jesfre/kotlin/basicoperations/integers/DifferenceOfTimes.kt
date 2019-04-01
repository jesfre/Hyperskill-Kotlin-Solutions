package com.blogspot.jesfre.kotlin.basicoperations.integers

/*
Difference of times

Given the values of the two moments in time in the same day: hours, minutes and seconds for each of the time moments. It is known that the second moment in time happened not earlier than the first one. Find how many seconds passed between these two moments of time.

Input data format

The program gets the input of the three integers: hours, minutes, seconds, defining the first moment of time and three integers that define the second moment time.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextLong()
    val m1 = scanner.nextLong()
    val s1 = scanner.nextLong()

    val h2 = scanner.nextLong()
    val m2 = scanner.nextLong()
    val s2 = scanner.nextLong()

    println((s2 + (m2*60) + (h2*60*60)) - (s1 + (m1*60) + (h1*60*60)))
}