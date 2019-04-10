package com.blogspot.jesfre.kotlin.controlflow.repeatblocks

/*
Maximum element divisible by 4
Given a sequence of natural numbers, not exceeding 30000. Find the its maximum element divisible by 4.
As input, the program gets the number of elements in the sequence, and then the elements themselves.
In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
The program should print the single number – the maximum element of the sequence divisible by 4.

Sample Input 1:
6
92
86
36
14
16
12

Sample Output 1:
92
* */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var maxEl = 0
    repeat(n) {
        val el = scanner.nextInt()
        if(el > maxEl && el%4 == 0) {
            maxEl = el
        }
    }
    println(maxEl)
}