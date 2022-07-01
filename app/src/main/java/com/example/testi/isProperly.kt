package com.example.testi

import java.util.*


private fun isProperly(m: String): Boolean {

    val c: Int = m.length
    val myStack = ArrayDeque<Char>()
    if (c % 2 == 1) {
        return false
    }
    for (i in 0 until c) {
        if (m[i] == ')'){
            if (myStack.isEmpty()){
                return false
            }
        }
        if (m[i] == '(') {
            myStack.push(m[i])
        }
        if (myStack.isNotEmpty() && (myStack.peek() == '(' && m[i] == ')')){
            myStack.pop()
            }
        }
    return myStack.isEmpty()
}

fun main (){

    val m: String? = readLine()

    if (m != null) {
        if(isProperly(m)){
            println("YES")
        }
        else
        {
            println("NO")
        }
    }
}