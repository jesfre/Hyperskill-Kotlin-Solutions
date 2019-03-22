package com.blogspot.jesfre.kotlin.firstlookkotlin.mathlibrary

/*
Max of four numbers

Write a program that reads four integer numbers and prints the max of them.
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()
    val n4 = scanner.nextInt()
    print(Math.max(n1, Math.max(n2, Math.max(n3, n4))))
}