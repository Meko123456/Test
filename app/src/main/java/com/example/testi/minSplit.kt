package com.example.testi

import java.util.*

/*2.     გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები.
დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა (თეთრებში) და
აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
Int minSplit(Int amount);*/

private fun minSplit(amount: Int): Int  {

    var z = amount
    val xurda = arrayOf( 1,5,10,20,50 )
    var indexi = xurda.size-1
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

    val x: Int = reader.nextInt()

    println(minSplit(x))

}