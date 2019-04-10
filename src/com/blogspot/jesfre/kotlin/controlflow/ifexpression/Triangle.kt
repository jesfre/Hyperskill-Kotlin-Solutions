package com.blogspot.jesfre.controlflow.ifexpression

import java.util.*

/*
Given three natural numbers A, B, C. Define if the triangle with such sides exists.
If the triangle exists - output the YES string, otherwise - output NO.
Note, a triangle is formed by three connected points that are not located on a single straight line.

Sample Input 1:
3
4
5

Sample Output 1:
YES
* */

fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    if(a < 1.0 || b < 1.0 || c < 1.0) println("NO")
    else if(a + b > c && a + c > b && b + c > a) println("YES")
    else println("NO")
}