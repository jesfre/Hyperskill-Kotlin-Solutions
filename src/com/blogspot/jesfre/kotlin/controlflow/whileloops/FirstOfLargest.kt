package com.blogspot.jesfre.kotlin.controlflow.whileloops

/*
The first position of the largest element

Write a program that a sequence of numbers with an undefined size and prints its largest element and its first position. The position starts with 1.

Sample Input 1:
5
1
2
3
4
5

Sample Output 1:

5 1

 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var largest = -1
    var counter = 0
    var pos = 0
    do {
        val e = scanner.nextInt()
        counter++
        val oldLargest = largest
        if(e > largest) {
            largest = e
            pos = counter
        }
    } while(e != oldLargest)
    println("$largest $pos")
}