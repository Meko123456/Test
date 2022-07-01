package com.example.testi

import java.util.*

private fun notContains(x: Array<Int>): Int  {


    return if (!x.contains(1)){
        1
    }else
    {
        0
    }
}


fun main (){

    val reader = Scanner(System.`in`)

    val x: Int = reader.nextInt()

    val arrayint = Array<Int>(x) { readLine()!!.toInt() }

    println(notContains(arrayint))


}