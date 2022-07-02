package com.example.testi

import java.util.*


/*5.     გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
Int countVariants(Int stearsCount);*/


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