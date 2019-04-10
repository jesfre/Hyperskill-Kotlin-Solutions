package com.blogspot.jesfre.kotlin.controlflow.repeatblocks

/*
A detector compares the size of parts produced by a machine with the reference standard.

If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as reject, and the detector prints the number -1.
If the part was made perfect, it is sent to the box with ready products, and the detector prints 0.

Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
The program should output numbers in a single line
    – the number of ready parts, the number of parts to be fixed, and the number of rejects.
 */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var ready = 0
    var toFix = 0
    var rejected = 0
    val n = scanner.nextInt()
    repeat(n) {
        val part = scanner.nextInt()
        when(part) {
            1 -> toFix++
            -1 -> rejected++
            0 -> ready++
        }
    }
    println("$ready $toFix $rejected")
}