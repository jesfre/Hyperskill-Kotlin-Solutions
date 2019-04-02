package com.blogspot.jesfre.kotlin.stringarraysranges.strings.templates

/*
Arithmetic expression
For a given two numbers output their sum formatted like in the examples.

Sample Input 1:
12 34

Sample Output 1:
12 plus 34 equals 46

Sample Input 2:
1 234

Sample Output 2:
1 plus 234 equals 235
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()

    println("$n1 plus ${n2} equals ${n1+n2}")
}
