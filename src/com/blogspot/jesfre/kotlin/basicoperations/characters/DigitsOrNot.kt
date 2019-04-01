package com.blogspot.jesfre.kotlin.basicoperations.characters

/*
Digits or not digits

Write a program that reads four characters and checks each character whether it is a digit.

The program must print true or false in place of each character. Separate results by slashes.

Sample Input 1:
3 @ 8 d

Sample Output 1:
true\false\true\false
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c1 = scanner.next().first().isDigit()
    val c2 = scanner.next().first().isDigit()
    val c3 = scanner.next().first().isDigit()
    val c4 = scanner.next().first().isDigit()

    println("$c1\\$c2\\$c3\\$c4")
}
