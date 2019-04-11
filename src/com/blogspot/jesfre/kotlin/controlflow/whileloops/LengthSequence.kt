package com.blogspot.jesfre.kotlin.controlflow.whileloops

/*
On the input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
The sequence ends with an integer 0, when reading which the program should end its work and output the length of the sequence (not counting the final 0).
Don’t read numbers following the number 0.

Sample Input 1:
1
7
9
0
5

Sample Output 1:
3
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var counter = 0;
    do {
        val n = scanner.nextInt()
        counter++
    }while(n>0);
    println(counter-1)
}