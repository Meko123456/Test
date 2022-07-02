package com.example.testi

/*1.     დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი  და
აბრუნებს პალინდრომია თუ არა. (პალინდრომი არის ტექსტი რომელიც
ერთნაირად იკითხება ორივე მხრიდან).
Boolean isPalindrome(String text);*/

private fun isPalindrome(text: String): Boolean {

    val c: Int = text.length

    for (i in 0 until c / 2) {
        if (text[i] != text[c - i - 1]) {
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

