package com.blogspot.jesfre.kotlin.functions.defaultarguments

/*
Print Username

Suppose you are writing a program that greets the new user on the forum. It should output "Hello, NAME!", where NAME is the username. But since it's a hackers forum, the user can select an option to hide his username during registration. In this situation, the program should output "Hello, secret user!". Try to invoke a greeting function without arguments when the username is hidden.

Input contains a single line - a username. If the username is hidden there is "HIDDEN" line.

Output the result of the greeting function.
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var un = scanner.nextLine()
    if(un == "HIDDEN") un="secret user"
    println("Hello, $un!")
}
