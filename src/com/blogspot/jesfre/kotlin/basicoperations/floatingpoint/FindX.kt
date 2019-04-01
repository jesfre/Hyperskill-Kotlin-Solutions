package com.blogspot.jesfre.kotlin.basicoperations.floatingpoint

/*
Find X

Write a program that reads three double values a, b, c, and then solving the simplest equation:

a * x + b = c
The program should output the value of x.

It's guaranteed, a is not 0.

Sample Input 1:
2 -1 2

Sample Output 1:
1.5
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val x = (c - b)/a
    println(x)
}
