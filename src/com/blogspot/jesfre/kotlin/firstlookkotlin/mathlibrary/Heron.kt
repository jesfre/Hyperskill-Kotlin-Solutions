package com.blogspot.jesfre.kotlin.firstlookkotlin.mathlibrary

/*
Many years ago when Paul went to school, he did not like the Heron's formula to calculate the area of a triangle, because he considered it very complex. Once he decided to help all school students: to write and distribute the program, calculating the area of a triangle by its three sides.

However, there was a problem: as Paul did not like the formula, he did not memorize it. Help him finish this act of kindness and write the program, calculating the area of a triangle by the transferred length of its sides, in accordance with the Heron's formula:

S=\sqrt{p(p−a)(p−b)(p−c)}
S=
p(p−a)(p−b)(p−c)
​

where p=((a+b+c)/2)– half-perimeter of the triangle.
On the input, the program has integers, and the output should be a real number corresponding to the area of the triangle.
Do not round the result.
 */

import java.util.Scanner

fun calcArea(a:Int, b:Int, c:Int):Double {
    val p:Double = (a+b+c)/2.0
    //println(p)

    val s = Math.sqrt(p*(p-a)*(p-b)*(p-c))

    return s
}

fun main(args: Array<String>) {
    //println(calcArea(3,4,5))
    //return

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(calcArea(a,b,c))

}
