package com.blogspot.jesfre.kotlin.standardio.input

/*
Four numbers

Write a program that reads four integer numbers from one line and prints them each in a new line. In the input line numbers are separated by one or more spaces.

Sample Input 1:
101    102 103  104

Sample Output 1:
101
102
103
104
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n1 = scanner.nextInt()
    var n2 = scanner.nextInt()
    var n3 = scanner.nextInt()
    var n4 = scanner.nextInt()

    println(n1)
    println(n2)
    println(n3)
    println(n4)
}