package com.example.testi

import java.util.*

val mySet = mutableSetOf<Int>()

private fun notContains(x: Array<Int>, n: Int): Int  {

    var z = 1

    for (i in 0 until n) {
        mySet.add(x[i])
    }

    for (i in 1 .. mySet.last()){
        if (!mySet.contains(i)){
            z = i
            return z
        }
    }
    /*while (mySet.isNotEmpty()){
        if (z != mySet.first() && !mySet.contains(1)) {
            println(z)
            return  0
        }
        z++
        mySet.remove(mySet.first())
    }*/
    return z
}


fun main (){

    val reader = Scanner(System.`in`)

    val x: Int = reader.nextInt()

    val arrayint = Array<Int>(x) { readLine()!!.toInt() }

    println(notContains(arrayint, x ))


}