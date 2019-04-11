package com.blogspot.jesfre.kotlin.controlflow.whileloops

/*
The sequence 1 2 2 3 3 3 ...

Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to).
The input to the program is a positive integer n – the number of the elements of the sequence the program should print.
On the output, it is expected to get the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.

Sample Input 1:
7

Sample Output 1:
1 2 2 3 3 3 4
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var count = 0
    var printing = 1
    while(count < n) {
        var internalCounter = 0
        while(internalCounter < printing && count < n) {
            print("$printing ")
            internalCounter++
            count++
        }
        printing++
    }
}