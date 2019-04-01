package com.blogspot.jesfre.kotlin.basicoperations.relational

/*
Check the sum

Write a program that reads the numbers a, b, c and checks if any pair of parameters (ab, ac, or bc) sums to 20.

The program must output true or false.

Sample Input 1:
1 2 3

Sample Output 1:
false

Sample Input 2:
4 16 7

Sample Output 2:
true
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(a+b==20 || a+c==20 || b+c==20)
}
