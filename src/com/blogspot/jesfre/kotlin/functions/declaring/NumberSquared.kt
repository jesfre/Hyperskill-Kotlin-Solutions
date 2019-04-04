package com.blogspot.jesfre.kotlin.functions.declaring

/*
Number squared

Write a method named square that takes one number and returns this number squared.
 */
import java.util.*

fun square(a:Int) = a*a

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}
