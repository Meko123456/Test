package com.example.testi

import java.util.*


private fun minSplit(x: Long): Int  {

    var z = x
    val xurda = arrayOf( 1,5,10,20,50 )
    var indexi = 4
    var sum = 0

    while (z > 0){
        if (z - xurda[indexi] >= 0){
            z -= xurda[indexi]
            sum++
        }else{
            indexi--
        }
    }
    return sum
}

fun main (){


    val reader = Scanner(System.`in`)

    val x: Long = reader.nextLong()

    println(minSplit(x))

}