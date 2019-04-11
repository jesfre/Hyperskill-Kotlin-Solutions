package com.blogspot.jesfre.kotlin.controlflow.forloop.arrays

/*
Two numbers never occur to each other

Write a program that reads an array of integers and two numbers n and m.
The program must check that n and m never occur next to each other (in any order) in the array.

Input data format

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output data format

The result is a single value - "YES", if n and m never occur to each other, otherwise, "NO".

Sample Input 1:
3
1 2 3
2 3

Sample Output 1:
NO

Sample Input 2:
3
1 2 3
3 4

Sample Output 2:
YES
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val s = scanner.nextInt()

    val array = IntArray(s)
    for (i in 0 until s) {
        array[i] = scanner.nextInt()
    }
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    var nextTo = false
    var prev = -1
    for(el in array) {
        // better using short circuit with break, but not taught in lessons
        if(!nextTo) {
            nextTo = (el == n && prev == m || el == m && prev == n)
            prev = el
        }
    }
    println(if(nextTo) "NO" else "YES")
}