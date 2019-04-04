package com.blogspot.jesfre.kotlin.functions.declaring

/*
Vowel or not

Write a function for checking the given English letter is a vowel or not. The input letter may be in any case.

Do not consider the letter 'y' as a vowel.

Your function should take a value of the Char type and returns a Boolean.

Use the provided code template.
Examples

1) isVowel('a') should be true
2) isVowel('A') should be true
3) isVowel('b') should be false
 */
import java.util.Scanner

fun isVowel(a:Char)= a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}
