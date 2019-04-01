package com.blogspot.jesfre.kotlin.basicoperations.floatingpoint

/*
Liquid pressure

Problem

Write a program that reads the density of a liquid and the height of a column, and calculates the liquid pressure. We suppose the gravity is 9.8 m/s² (Earth). Do not format the result.

Some explanations
When a person swims under the water, water pressure is felt acting on the person's eardrums. The deeper that person swims, the greater the pressure. The pressure felt is due to the weight of the water above the person. As someone swims deeper, there is more water above the person and therefore greater pressure. The pressure a liquid exerts depends on its depth.
Liquid pressure also depends on the density of the liquid. If someone was submerged in a liquid more dense than water, the pressure would be correspondingly greater. thus we can say that the depth, density and liquid pressure are directly proportionate. The pressure due to a liquid in liquid columns of constant density or at a depth within a substance is represented by the following formula:

p=ρ.g.h

where:
p is liquid pressure,
g is gravity at the surface of overlaying material,
ρ is density of liquid,
h is height of liquid column.

Sample Input 1:
1.7 5.5

Sample Output 1:
91.63
 */
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val d = scanner.nextDouble()
    val h = scanner.nextDouble()
    val G = 9.8;

    val p = d * G * h
    println(p)
}
