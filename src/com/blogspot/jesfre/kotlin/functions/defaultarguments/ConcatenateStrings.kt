package com.blogspot.jesfre.kotlin.functions.defaultarguments

/*
Concatenate 3 strings with separator

Write a function that concatenates three strings into one using a special separator. If the separator is not specified then it should be a single space.

The first three lines of the input contain three lines to be concatenated. The fourth line of the input contains a line separator. If there is no special separator, the line equals "NO SEPARATOR".

Output the result of the concatenating function.
 */

import java.util.*

fun concat(l1:String, l2:String, l3:String, sep:String=" ") = " "

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val l1 = scanner.nextLine()
    val l2 = scanner.nextLine()
    val l3 = scanner.nextLine()
    var sep = scanner.nextLine()

    if(sep == "NO SEPARATOR") {
        sep = " "
    }
    println(l1 + sep + l2 + sep + l3 )
}
