package com.blogspot.jesfre.kotlin.common

class Test {

    companion object {
        fun assertEquals(num:Int=-1, result:String, expected:String):String {
            var count = if(num > 0) num else 0

            if(result == expected) {
                println("$num. OK. $result")
            } else {
                println("$num. WRONG. \n\tGIVEN:$result \n\tEXPECTED:$expected")
            }
            return result
        }
    }

}