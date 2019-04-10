package com.blogspot.jesfre.kotlin.controlflow.whenexpression

/*
Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus)
    and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number).
    If it is a number, which doesn't correspond to any of the listed shapes, the program should output:
    "There is no such shape!".
Note: output text should exactly match the sample! Including letters case and location of spaces.

Sample Input 1:
1

Sample Output 1:
You have chosen a square
*/

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val s = scanner.nextInt()

    when(s) {
        1 -> println("You have chosen a square")
        2 -> println("You have chosen a circle")
        3 -> println("You have chosen a triangle")
        4 -> println("You have chosen a rhombus")
        else -> println("There is no such shape!")
    }
}
