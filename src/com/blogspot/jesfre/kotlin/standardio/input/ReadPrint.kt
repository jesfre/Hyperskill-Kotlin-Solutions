package com.blogspot.jesfre.kotlin.standardio.input

/*
Read and print

Write a program that reads two lines and two numbers (in one line) and outputs them in the same order, each in a new line.

Sample Input 1:
Hello
Kotlin
500 600

Sample Output 1:
Hello
Kotlin
500
600
 */
import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val v1 = scanner.nextLine()
    val v2 = scanner.nextLine()
    val v3 = scanner.nextInt()
    val v4 = scanner.nextInt()

    println(v1);
    println(v2);
    println(v3);
    println(v4);
}
