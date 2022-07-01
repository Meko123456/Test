package com.example.testi


private fun isPalindrome(x: String): Boolean {

    val c: Int = x.length

    for (i in 0 until c / 2) {
        if (x[i] != x[c - i - 1]) {
            return false
        }
    }
    return true
}

fun main (){

    val x: String? = readLine()

    if (x != null) {
        if(isPalindrome(x)){
            println("YES")
        }else{
            println("NO")
        }
    }

}

