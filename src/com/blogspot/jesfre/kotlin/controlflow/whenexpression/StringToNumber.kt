package com.blogspot.jesfre.kotlin.controlflow.whenexpression

/*
Write a program that read a string from the standard input and outputs the number.
A number can be from 1 to 9 (inclusive).

Sample Input 1:
one

Sample Output 1:
1
* */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().trim()

    println(when(n) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        else -> 9
    })

}