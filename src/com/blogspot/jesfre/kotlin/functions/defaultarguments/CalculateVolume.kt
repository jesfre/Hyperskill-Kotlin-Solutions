package com.blogspot.jesfre.kotlin.functions.defaultarguments

/*
Calculate volume

Create a function called getVolume, which takes 3 Int arguments which supposed to be a length, a width and a height of some object. If the third, or both the third and the second dimensions are not specified, they should be 1 by default.
Sample Input 1:
2 3 4

Sample Output 1:
2 6 24
 */

import java.util.*

fun getVolume(l:Int, w:Int=1, h:Int=1) = l*h*w

// do not change code below
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val length = scanner.nextInt()
    val width = scanner.nextInt()
    val height = scanner.nextInt()

    print("${getVolume(length)} ")
    print("${getVolume(length, width)} ")
    print("${getVolume(length, width, height)} ")
}
