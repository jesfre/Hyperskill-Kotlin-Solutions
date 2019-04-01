package com.blogspot.jesfre.kotlin.basicoperations.relational

/*
Boys in a sport class

Suppose there are three boys in a sports class.

You need to write a program that checks the boys are arranged in the ascending or descending order by height. The program must read three integer numbers h1, h2, h3 and outputs true or false. If boys have the same height, they are considered as correctly arranged.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val h3 = scanner.nextInt()

    println(h1 <= h2 && h2 <= h3 || h1 >= h2 && h2 >= h3)
}
