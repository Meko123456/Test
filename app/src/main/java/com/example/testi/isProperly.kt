package com.example.testi

import java.util.*

/*4.     მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან.
დაწერეთ ფუნქცია რომელიც აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
Boolean isProperly(String sequence);
მაგ: (()()) სწორი მიმდევრობაა,  ())() არასწორია*/


private fun isProperly(sequence: String): Boolean {

    val c: Int = sequence.length
    val myStack = ArrayDeque<Char>()
    if (c % 2 == 1) {
        return false
    }
    for (i in 0 until c) {
        if (sequence[i] == ')'){
            if (myStack.isEmpty()){
                return false
            }
        }
        if (sequence[i] == '(') {
            myStack.push(sequence[i])
        }
        if (myStack.isNotEmpty() && (myStack.peek() == '(' && sequence[i] == ')')){
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