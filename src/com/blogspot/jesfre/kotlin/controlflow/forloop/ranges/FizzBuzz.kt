package com.blogspot.jesfre.kotlin.controlflow.forloop.ranges

/*
Fizz Buzz is a classic programming problem. Here is its slightly modified version.

Write a program that takes the input of two integers: the beginning and the end of the interval
(both numbers belong to the interval).

The program should output the numbers from this interval,
but if the number is divisible by 3, you should output Fizz instead of it,
if the number is divisible by 5 - output Buzz,
and if it is divisible both by 3 and by 5 - output FizzBuzz.

Output each number or the word on a separate line.
Sample Input 1:
8 16

Sample Output 1:
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val beg = scanner.nextInt()
    val end = scanner.nextInt()

    for(i in beg..end) {
        println(
            when {
                i%3 == 0 && i%5 == 0 -> "FizzBuzz"
                i%3 == 0 -> "Fizz"
                i%5 == 0 -> "Buzz"
                else -> i
            }
        )

    }
}