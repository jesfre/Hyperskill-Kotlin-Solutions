package com.blogspot.jesfre.kotlin.stringarraysranges.strings.templates

/*
The information about a person

Write a program that reads the first name, the last name and the age of a person and then display the information in another form (see examples).

Use string templates to solve the problem.
Sample Input 1:
John Smith 30

Sample Output 1:
J. Smith, 30 years old

Sample Input 2:
Reece Weber 20

Sample Output 2:
R. Weber, 20 years old
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val fname = scanner.next()
    val lname = scanner.next()
    val age = scanner.next()

    println("${fname[0]}. $lname, $age years old")
}
