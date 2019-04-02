package com.blogspot.jesfre.kotlin.stringarraysranges.strings.templates

/*
Date and time formatting

You need to write a program that prints date and time in a special formatted way. Hours, minutes and seconds should be split by a colon, and day, month and year should be split by a slash. You can see the examples below.

Sample Input 1:
23 59 59 12 12 2018

Sample Output 1:
23:59:59 12/12/2018

Sample Input 2:
1 2 3 4 5 2018

Sample Output 2:
1:2:3 4/5/2018
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val t1 = scanner.nextInt()
    val t2 = scanner.nextInt()
    val t3 = scanner.nextInt()
    val d1 = scanner.nextInt()
    val d2 = scanner.nextInt()
    val d3 = scanner.nextInt()

    println("$t1:$t2:$t3 $d1/$d2/$d3")
}
