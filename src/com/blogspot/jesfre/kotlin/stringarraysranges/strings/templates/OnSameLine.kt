package com.blogspot.jesfre.kotlin.stringarraysranges.strings.templates

/*
Print two numbers on the same line

Write a program that reads two integer numbers and prints them on the same line separated by a space.

Please, use string templates to solve the problem.
Sample Input 1:
8
11

Sample Output 1:
8 11
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    println("$n1 $n2")
}
