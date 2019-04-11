package com.blogspot.jesfre.kotlin.controlflow.forloop.arrays

/*
The index of the first max in an array

Write a program that read an array of ints and finds the index of the first maximum in an array.

The first line contains the number of elements in the array.
The second line contains the array elements separated by spaces.
An array always has at least one element.

Output only a single integer value - the index of the first maximum.

Sample Input 1:
5
2 5 3 4 5

Sample Output 1:
1

Sample Input 2:
6
1000 10 1000 10 10 1001

Sample Output 2:
5
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ne = scanner.nextInt()

    // Not fixed with arrays. Not necessary

    var max = -1
    var ixMax = -1
    for(i in 0 until ne) {
        val element = scanner.nextInt()
        if(element > max) {
            max = element
            ixMax = i
        }
    }
    println(ixMax)
}