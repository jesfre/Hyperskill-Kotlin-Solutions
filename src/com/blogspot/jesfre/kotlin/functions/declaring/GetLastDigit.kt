package com.blogspot.jesfre.kotlin.functions.declaring

/*
Get last digit

Write a method named getLastDigit that takes one number and returns the last digit of it.
 */
import java.util.*

fun getLastDigit(n:Int) = Math.abs(n%10)

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}
