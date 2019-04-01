package com.blogspot.jesfre.kotlin.basicoperations.characters

/*
Sequence

Write a program that reads three characters and checks they are ordered according to the Unicode table, and each next character immediately follows the previous one (i.e. 'a', 'b', 'c' or 'x', 'y', 'z').

The program must print true or false.
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c1 = scanner.next().first()
    val c2 = scanner.next().first()
    val c3 = scanner.next().first()

    println(c1+1 == c2 && c2+1 == c3)
}
