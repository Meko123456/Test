package com.example.testi

import java.util.*


private fun countVariants(n: Int): Int {

    return if (n == 0) {
        1
    }else if (n < 0){
        0
    }else{
        countVariants(n - 2) + countVariants(n - 1)
    }
}
fun main (){

    val reader = Scanner(System.`in`)

    val x: Int = reader.nextInt()

    println(countVariants(x))

}