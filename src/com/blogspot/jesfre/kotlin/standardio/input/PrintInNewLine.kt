package com.blogspot.jesfre.kotlin.standardio.input

/*
Printing each word in a new line

Write a program that reads five words from the standard input and outputs each word in a new line. First, you need to print all the words from the first line, then from the second (from the left to right).

The words can be placed in the input stream in any way.

Use Scanner to solve the problem.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val v1 = scanner.next()
    val v2 = scanner.next()
    val v3 = scanner.next()
    val v4 = scanner.next()
    val v5 = scanner.next()

    println(v1)
    println(v2)
    println(v3)
    println(v4)
    println(v5)
}