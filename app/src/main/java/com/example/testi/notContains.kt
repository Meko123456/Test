package com.example.testi

import java.util.*

/*3.     მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან.
დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს,
რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
Int notContains(Int[] array);*/


val mySet = mutableSetOf<Int>()

private fun notContains(array: Array<Int>): Int  {

    var z = 1

    for (element in array) {
        mySet.add(element)
    }

    for (i in 1 .. mySet.last()){
        if (!mySet.contains(i)){
            z = i
            return z
        }else{
            z++
        }
    }

    return z
}


fun main (){

    val reader = Scanner(System.`in`)

    val x: Int = reader.nextInt()

    val arrayint = Array<Int>(x) { readLine()!!.toInt() }

    println(notContains(arrayint))


}