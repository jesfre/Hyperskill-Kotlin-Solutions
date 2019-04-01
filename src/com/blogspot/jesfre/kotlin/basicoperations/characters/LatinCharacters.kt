package com.blogspot.jesfre.kotlin.basicoperations.characters

/*
Compare Latin letters

Write a program that reads two Latin letters as characters, and compares them ignoring cases.
The program must print true or false.

Sample Input 1:
a b

Sample Output 1:
false

Sample Input 2:
d D

Sample Output 2:
true
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c1 = scanner.next().first().toLowerCase()
    val c2 = scanner.next().first().toLowerCase()

    println(c1 == c2)
}
