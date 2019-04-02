package com.blogspot.jesfre.kotlin.stringarraysranges.strings.templates

/*
N-th symbol
For a given string and a number N print N-th symbol formatted like in the example.

Sample Input 1:
hyperskill
5

Sample Output 1:
5-th symbol of the string "hyperskill" is 'r'

Sample Input 2:
hello world
1

Sample Output 2:
1-th symbol of the string "hello world" is 'h'
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    val num = scanner.nextInt()

    println("$num-th symbol of the string \"$line\" is '${line[num-1]}'")
}
