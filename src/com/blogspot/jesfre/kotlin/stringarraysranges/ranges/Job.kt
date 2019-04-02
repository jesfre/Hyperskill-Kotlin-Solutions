package com.blogspot.jesfre.kotlin.stringarraysranges.ranges

/*
Job

Jack wants to get a job. But by the law of the country he lives in, he can work only if his age is within 18 to 59 years inclusive.
For a given age of Jack output "YES" if he can get a job, otherwise output "NO".
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val age = scanner.nextInt()
    if(age in 18..59)
        println("YES")
    else
        println("NO")
}
