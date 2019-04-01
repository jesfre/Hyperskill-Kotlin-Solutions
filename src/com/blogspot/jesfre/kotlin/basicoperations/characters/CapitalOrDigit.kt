package com.blogspot.jesfre.kotlin.basicoperations.characters

/*
Is a capital letter or a digit

Write a program that reads a character and checks that it is a capital letter, or a digit from 1 to 9.

The program must print true or false.
Sample Input 1:
A

Sample Output 1:
true
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c = scanner.next().first()

    println(c.isUpperCase() || c in '1'..'9')
}
