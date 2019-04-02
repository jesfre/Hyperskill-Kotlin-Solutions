package com.blogspot.jesfre.kotlin.stringarraysranges.ranges

/*
Inside one range

Write a program that reads five integer numbers. The first and the second number creates one range, the third and the forth creates another range. Output "YES" if the fifth number is inside at least one range, otherwise output "NO".
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val r1a = scanner.nextInt()
    val r1b = scanner.nextInt()
    val r2a = scanner.nextInt()
    val r2b = scanner.nextInt()
    val v = scanner.nextInt()

    val range1 = r1a..r1b
    val range2 = r2a..r2b

    if(v in range1 || v in range2)
        println("YES")
    else
        println("NO")
}
