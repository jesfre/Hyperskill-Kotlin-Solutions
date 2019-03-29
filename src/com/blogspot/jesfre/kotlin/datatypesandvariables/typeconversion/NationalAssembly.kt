package com.blogspot.jesfre.kotlin.datatypesandvariables.typeconversion

/*
In a far country, elections to the National Assembly is coming soon. This country has one specific feature - the population growths very fast every year.

You need to write a program to calculate how many people need to be selected to the National Assembly in this elections. The country uses the cube root relationship between the population and assembly size. The fractional number is rounded down not to take an excess person.

The input data of the program is an integer value describing the current country's population. The output should be the recommended size of the Nation Assembly.

Use Math.cbrt(val: Double) function to calculate the square root of a number. But keep in mind, it takes Double and returns Double.
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val p = scanner.nextDouble()
    val sq = Math.cbrt(p)
    println(sq.toInt())
}

