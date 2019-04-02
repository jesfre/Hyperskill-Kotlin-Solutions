package com.blogspot.jesfre.kotlin.stringarraysranges.ranges

/*
Inside both ranges

Write a program that reads five integer numbers. The first and the second number creates one range, the third and the forth creates another range. Output "YES" if the fifth number is inside both this ranges, otherwise output "NO".
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val r1a = scanner.nextInt()
    val r1b = scanner.nextInt()
    val r2a = scanner.nextInt()
    val r2b = scanner.nextInt()
    val v = scanner.nextInt()
    if(v in r1a..r1b && v in r2a..r2b) println("YES")
    else println("NO")
}
