package com.blogspot.jesfre.kotlin.controlflow.whileloops

/*
Squares of natural numbers

Given integer N. Print all the squares of natural numbers, not exceeding N, in ascending order.

Sample Input 1:
50

Sample Output 1:
1
4
9
16
25
36
49
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var counter = 0.0
    while(counter < n) {
        counter++
        val sq = Math.sqrt(counter)
        val isNatural = sq - sq.toInt() == 0.0
        //println("$sq , ${sq.toInt()}, $isNatural")
        if(isNatural) println(counter.toInt())
    }
}