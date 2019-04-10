package com.blogspot.jesfre.controlflow.ifexpression

/*
Ann watched a TV program about health and learned that it is recommended to sleep at least AA hours per day,
but oversleeping is also not healthy and you should not sleep more than BB hours. Now Ann sleeps HH hours per day.
If Ann's sleep schedule complies with the requirements of that TV program – print "Normal".
If Ann sleeps less than AA hours, output “Deficiency”, if she sleeps more than BB hours, output “Excess”.

Input to this program are the three strings with variables in the following order: A A, B B, H H. A A is always less than or equal to B B.

Please note latters case: the output should exactly correspond to what required in the problem, i.e. if the program has to output "Excess",
such output as "excess", "EXCESS", "ExCeSs" and others will not be graded as correct.

You should carefully think about all conditions, which you need to use. A special attention should be paid to the strictness of the used conditional operators:
distinguish between \lt < and \le ≤; \gt > and \ge ≥. In order to understand which ones to use, please carefully read the problem statement.
* */

import java.util.*

val NORMAL = "Normal"
val DEFICIENCY = "Deficiency"
val EXCESS = "Excess"

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    if(h < a)
        println(DEFICIENCY)
    else if(h>b)
        println(EXCESS)
    else
        println(NORMAL)
}