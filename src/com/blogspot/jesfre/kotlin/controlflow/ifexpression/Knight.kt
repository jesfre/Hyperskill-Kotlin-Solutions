package com.blogspot.jesfre.controlflow.ifexpression

import java.util.*

val log = false

fun _println(s:String) {
    if(log) println(s)
}

fun validatePositions(x:Int, y:Int):String {
    val str = if(x in 1..8 && y in 1..8) "$x:$y" else ""
    return str
}

fun move1(x:Int, y:Int):String { return validatePositions(x-1, y+2) }
fun move2(x:Int, y:Int):String { return validatePositions(x-1, y-2) }
fun move3(x:Int, y:Int):String { return validatePositions(x+1, y+2) }
fun move4(x:Int, y:Int):String { return validatePositions(x+1, y-2) }
fun move5(x:Int, y:Int):String { return validatePositions(x-2, y+1) }
fun move6(x:Int, y:Int):String { return validatePositions(x-2, y-1) }
fun move7(x:Int, y:Int):String { return validatePositions(x+2, y+1) }
fun move8(x:Int, y:Int):String { return validatePositions(x+2, y-1) }

/**
 * @param kpos Knight position in X:Y, e.g. '3:5'
 * @param okx other knight starting X
 * @param oky other knight starting Y
 */
fun compare(kpos:String, okx:Int, oky:Int):Boolean {
    if(kpos == "") return false

    val okm1 = move1(okx, oky)
    _println("kpos=$kpos, okm1=$okm1")
    if(okm1 != "" && kpos == okm1) return true

    val okm2 = move2(okx, oky)
    _println("kpos=$kpos, okm2=$okm2")
    if(okm2 != "" && kpos == okm2) return true

    val okm3 = move3(okx, oky)
    _println("kpos=$kpos, okm3=$okm3")
    if(okm3 != "" && kpos == okm3) return true

    val okm4 = move4(okx, oky)
    _println("kpos=$kpos, okm4=$okm4")
    if(okm4 != "" && kpos == okm4) return true

    val okm5 = move5(okx, oky)
    _println("kpos=$kpos, okm5=$okm5")
    if(okm5 != "" && kpos == okm5) return true

    val okm6 = move6(okx, oky)
    _println("kpos=$kpos, okm6=$okm6")
    if(okm6 != "" && kpos == okm6) return true

    val okm7 = move7(okx, oky)
    _println("kpos=$kpos, okm7=$okm7")
    if(okm7 != "" && kpos == okm7) return true

    val okm8 = move8(okx, oky)
    _println("kpos=$kpos, okm8=$okm8")
    if(okm8 != "" && kpos == okm8) return true

    return false
}

fun rideKnights(x1:Int, y1:Int, x2:Int, y2:Int):String {
    _println("K1=$x1:$y1, K2=$x2:$y2")
    if(x1 !in 1..8 || y1 !in 1..8 || x2 !in 1..8 || y2 !in 1..8)
        return "NO"

    if(x1 == x2 && y1 == y2) {
        return "YES"
    }

    if (compare("$x1:$y1", x2, y2)) return "YES"

    val k1m1 = move1(x1, y1)
    if (compare(k1m1, x2, y2)) return "YES"

    val k1m2 = move2(x1, y1)
    if (compare(k1m2, x2, y2)) return "YES"

    val k1m3 = move3(x1, y1)
    if (compare(k1m3, x2, y2)) return "YES"

    val k1m4 = move4(x1, y1)
    if (compare(k1m4, x2, y2)) return "YES"

    val k1m5 = move5(x1, y1)
    if (compare(k1m5, x2, y2)) return "YES"

    val k1m6 = move6(x1, y1)
    if (compare(k1m6, x2, y2)) return "YES"

    val k1m7 = move7(x1, y1)
    if (compare(k1m7, x2, y2)) return "YES"

    val k1m8 = move8(x1, y1)
    if (compare(k1m8, x2, y2)) return "YES"

    return "NO"
}

fun main(args: Array<String>) {
    println(rideKnights(1,1,2,3))
    println(rideKnights(1,1,2,2))
    println(rideKnights(1,1,1,4))
    println(rideKnights(4,3,3,5))
    println(rideKnights(0,0,0,0))
    println(rideKnights(1,1,1,1))
    println(rideKnights(-1,-1,-1,-1))
    println(rideKnights(8,8,8,8))
    println(rideKnights(9,1,1,1))
}