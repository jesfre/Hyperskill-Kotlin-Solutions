package com.blogspot.jesfre.kotlin.firstlookkotlin.mathlibrary

/*
Pow

Given two floating-point numbers: a and b.

Calculate and output the value of the expression a^b.

Note, use double variables for a and b.

Input data format:
Two floating-point numbers in one line.

Output data format:
The result of the expression.

Sample Input 1:
2 3

Sample Output 1:
8.0

Sample Input 2:
2 1.02

Sample Output 2:
2.027918959580058
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()

    println(Math.pow(a, b))
}
