package com.blogspot.jesfre.controlflow.ifexpression

import java.util.*

/*
Write a program that reads an integer number and checks it is divided by 2, 3, 5, and 6.
If the number is divided by M, the program should output "Divided by M".
The program should check all divisors above. The order of divisors in the result may be any.

Sample Input 1:
6

Sample Output 1:
Divided by 2
Divided by 3
Divided by 6
* */

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    if(n % 2 == 0) println("Divided by 2")
    if(n % 3 == 0) println("Divided by 3")
    if(n % 5 == 0) println("Divided by 5")
    if(n % 6 == 0) println("Divided by 6")
}