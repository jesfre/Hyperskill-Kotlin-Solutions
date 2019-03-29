package com.blogspot.jesfre.kotlin.datatypesandvariables.typeconversion

/*
Write a program that cuts the fractional part of a number.
Use Double as the input type and Long as the result because a value can be quite large.
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextDouble()
    println(n.toLong())
}
