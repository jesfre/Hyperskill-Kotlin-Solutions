package com.blogspot.jesfre.kotlin.functions.namedarguments

/*
Deposit

Write a function that calculates how much money would earn a customer for a given starting amount, number of yearly percents and a number of years for holding a deposit in the bank.

The common parameters are $1000 for starting amount, 5% for yearly percents and 10 years for holding the deposit.

A customer arrived at the bank and created a new deposit. He changed only one parameter, others stayed as default.

The first line of the input contains the parameter that this customer changed - "amount" for starting amount, "percents" for yearly percents, "years" for amount of years. Next line contains a single integer number - value of a parameter.

Output how much would this customer get after holding this deposit. Output only integer part of it.

Try to use named parameters to solve this problem.
 */

import java.util.*

fun deposit(a:Int=1000, p:Int=5, y:Int=10): Int {
    var tot :Double = a.toDouble();
    var c = 0;
    while(c<y) {
        tot = tot + (p.toDouble()/100 * tot)
        c++
    }
    return tot.toInt()
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val p = scanner.next()
    val v = scanner.nextInt()

    val r = when(p) {
        "amount" -> deposit(v)
        "percents" -> deposit(p=v)
        else -> deposit(y=v)
    }

    println(r)
}
