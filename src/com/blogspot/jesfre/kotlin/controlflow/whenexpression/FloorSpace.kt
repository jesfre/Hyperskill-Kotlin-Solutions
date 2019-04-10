package com.blogspot.jesfre.kotlin.controlflow.whenexpression

/*
Floor-space of the room
Residents of the Malevia country often experiment with the plan of their rooms.
Rooms can be triangular, rectangular and round.
To quickly calculate the floorage it is required to write a program,
which gets the type of the room shape and the relevant parameters as input -
the program should output the area of the resulting room.

The value of 3.14 is used instead of the number π in Malevia.

Hint: Math library may help you to solve this task.

Input format used by the Malevians:

triangle
a
b
c

where a, b and c — lengths of the triangle sides.

rectangle
a
b

where a and b — lengths of the rectangle sides.

circle
r

where r — circle radius.

Note, the input values (a, b, c, r) are doubles as well as your answer should be.
Sample Input 1:

rectangle
4
10
Sample Output 1:

40.0
Sample Input 2:

circle
5
Sample Output 2:

78.5
Sample Input 3:

triangle
3
4
5
Sample Output 3:

6.0

* */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val shape = scanner.nextLine()
    val area = when(shape) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val s = (a+b+c)/2
            Math.sqrt(s * (s-a) * (s-b) * (s-c))
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            a*b
        }
        else -> { // circle
            val r = scanner.nextDouble()
            3.14 * Math.pow(r, 2.0)
        }
    }
    println(area)
}