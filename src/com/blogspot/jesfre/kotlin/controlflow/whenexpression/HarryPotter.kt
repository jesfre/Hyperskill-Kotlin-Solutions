package com.blogspot.jesfre.kotlin.controlflow.whenexpression

/*
Harry Potter needs help identifying what each house means.

Read a string representing a house and output the following:

if it is "gryffindor", output "bravery";
if it is "hufflepuff", output "loyalty";
if it is "slytherin", output "cunning";
if it is "ravenclaw", log "intellect";
otherwise, output "not a valid house".
* */

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h = scanner.nextLine().trim()

    println(when(h) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    })
}