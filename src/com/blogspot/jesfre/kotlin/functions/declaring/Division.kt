package com.blogspot.jesfre.kotlin.functions.declaring

/*
Division

Write a method named divide that takes two long numbers and returns a double value. It should return the result of the division the first argument by the second one. It's guaranteed the second argument is not equal to zero.
 */
import java.util.*

fun divide(a:Long, b:Long):Double {
    val ta = a.toDouble()
    val tb = b.toDouble()
    //println((a/b) +"."+ (a%b*10/b))
    //println("${a/b}.${a%b*10/b}")
    //println("${a/b}.${a%b*10/b}".toDouble())
    //return "${a/b}.${a%b*10/b}".toDouble()
    return ta/tb
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}
