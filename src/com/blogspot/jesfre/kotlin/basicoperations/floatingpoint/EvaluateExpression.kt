package com.blogspot.jesfre.kotlin.basicoperations.floatingpoint

/*
Evaluate an expression

Write a program which reads a double value x x and evaluates the result of x^3 + x^2 + x + 1

Output data format
The double result of the expression.

Sample Input 1:
22.5

Sample Output 1:
11920.375
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextDouble()

    println("${x*x*x + x*x + x + 1}")
}
