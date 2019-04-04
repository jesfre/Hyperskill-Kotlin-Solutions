package com.blogspot.jesfre.kotlin.functions.declaring

/*
The sum of three numbers

Write a function named sum that takes three integer numbers and returns their sum.
 */
import java.util.Scanner

fun sum(a:Int, b:Int, c:Int) = a+b+c
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}
