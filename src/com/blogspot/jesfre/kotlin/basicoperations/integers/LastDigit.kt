package com.blogspot.jesfre.kotlin.basicoperations.integers

/*
The last digit of a number

Write a program that reads a number and outputs its last digit.

Sample Input 1:
425

Sample Output 1:
5
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextLong()

    println("${num%10}")
}