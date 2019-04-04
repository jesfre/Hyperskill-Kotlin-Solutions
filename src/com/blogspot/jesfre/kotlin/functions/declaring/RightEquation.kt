package com.blogspot.jesfre.kotlin.functions.declaring


/*
Right equation

Write a method named isRightEquation that takes three numbers and returns true if multiplication of the first two is equals to the third number, otherwise returns false.
 */
import java.util.*

fun isRightEquation(a:Int, b:Int, c:Int) = a*b == c

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}
