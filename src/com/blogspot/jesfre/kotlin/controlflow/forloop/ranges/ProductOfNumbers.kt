package com.blogspot.jesfre.kotlin.controlflow.forloop.ranges

/*
The product of numbers from a to b

Write a program that prints the production of all integer numbers from a to b (a < b).
Include a and exclude b from the production.

Sample Input 1:
1 2

Sample Output 1:
1

Sample Input 2:
100 105

Sample Output 2:
11035502400
 */

import java.util.Scanner

fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    var product = 1L
    for(i in a until b) {
       product *= i
    }
    println(product)
}