package com.blogspot.jesfre.kotlin.basicoperations.integers

/*
The sum of digits

Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.

Sample Input 1:
476

Sample Output 1:
17
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()

    val r1 = num%10
    num = num-r1
    val r2 = num%100/10
    num = num - num%100
    val r3 = num/100
    println(r1+r2+r3)
}
