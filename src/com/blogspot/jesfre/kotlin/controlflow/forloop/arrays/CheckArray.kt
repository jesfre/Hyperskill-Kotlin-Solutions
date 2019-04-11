package com.blogspot.jesfre.kotlin.controlflow.forloop.arrays

/*
Check if an array contains two numbers

Write a program that reads an unsorted array of integers and two numbers n and m.
The program must check if n and m occur next to each other in the array (in any order).

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output "YES" or "NO".

Sample Input 1:
3
1 3 2
2 3

Sample Output 1:
YES

Sample Input 2:
3
1 2 3
3 4

Sample Output 2:
NO
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
        // short circuit with break, but not taught in lessons
        if(!nextTo) {
            nextTo = (el == n && prev == m || el == m && prev == n)
            prev = el
        }
    }
    println(if(nextTo) "YES" else "NO")
}