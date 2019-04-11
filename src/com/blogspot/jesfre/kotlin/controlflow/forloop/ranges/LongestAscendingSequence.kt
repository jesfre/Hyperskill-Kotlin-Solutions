package com.blogspot.jesfre.kotlin.controlflow.forloop.ranges

/*
The longest ascending sequence

Write a program that reads N numbers and outputs the length of the longest sequence in ascending order.
Elements of the sequence must go one after another.

The first line contains the number N.
The second line contains N numbers separated by spaces.

Example

The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5.
It includes the following elements: 1 2 3 5 7.

Sample Input 1:
10
1 2 4 1 2 3 5 7 4 3

Sample Output 1:
5
 */

import java.util.Scanner

fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var prevEl = -1
    var maxCounter = 0
    var counter = 0

    for(i in 1..n) {
        val el = scanner.nextInt()
        if(el > prevEl) {
            counter++
        }
        if(counter > maxCounter) {
            maxCounter = counter
        }
        if(el <= prevEl) {
            counter = 1
        }
        prevEl = el
    }

    println(maxCounter)
}