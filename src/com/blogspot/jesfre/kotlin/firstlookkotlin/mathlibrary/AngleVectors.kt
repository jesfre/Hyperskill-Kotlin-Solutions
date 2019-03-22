package com.blogspot.jesfre.kotlin.firstlookkotlin.mathlibrary

/*
Given two 2D vectors. Find the angle (degree) between them.

If you don't know how to find the angle, see here: http://www.wikihow.com/Find-the-Angle-Between-Two-Vectors.

Input data format
The first line contains two components of the first vector, the second line contains two components of the second vector. Components in one line are separated by space.

Output data format
One fractional ﻿value - an angle between two vectors. Do not round it.
 */

import java.util.Scanner

fun calcAngle(a1:Int, a2: Int, b1: Int, b2:Int):Double {
    val axb = a1 * b1 + a2 * b2
    val v1 = Math.sqrt(Math.pow(a1.toDouble(), 2.0) + Math.pow(a2.toDouble(), 2.0))
    val v2 = Math.sqrt(Math.pow(b1.toDouble(), 2.0) + Math.pow(b2.toDouble(), 2.0))
    val angRad = Math.acos(axb / (v1*v2))
    val degrees = Math.toDegrees(angRad)

    return degrees
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val u1 = scanner.nextInt()
    val u2 = scanner.nextInt()
    val v1 = scanner.nextInt()
    val v2 = scanner.nextInt()

    println(calcAngle(u1, u2, v1, v2))
}