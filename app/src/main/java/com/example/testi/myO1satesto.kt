package com.example.testi

/*6.     დაწერეთ საკუთარი მონაცემთა სტრუქტურა,
რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ ელემენტი.*/



fun main () {
    val x = merabaList.CustomList<Int>()
    x.insert(50)
    x.insert(20)
    x.insert(300)
    x.insert(40)
    x.insert(51)
    var zoma: Int = x.size()

   for (i in 0 until zoma){
        println(x.get(i))
    }

    x.remove(20)
    x.remove(x.get(2))

    zoma = x.size()

    println()

    for (i in 0 until zoma){
        println(x.get(i))
    }





}



