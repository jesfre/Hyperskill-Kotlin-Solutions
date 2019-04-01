package com.blogspot.jesfre.kotlin.basicoperations.relational

/*
Check the value

Write a program that reads a value and checks it is less than 10 and greater than 0.

Sample Input 1:
0

Sample Output 1:
false
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    println(n>0 && n<10)
}
