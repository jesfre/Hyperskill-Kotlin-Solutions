package com.blogspot.jesfre.kotlin.controlflow.repeatblocks

/*
Write a program that reads a line and prints it 10 times on a new line.
A line may consist of multiple words separated by spaces.
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()

    repeat(10) {println(line)}
}