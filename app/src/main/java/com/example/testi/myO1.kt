package com.example.testi

import java.lang.IndexOutOfBoundsException

/*6.     დაწერეთ საკუთარი მონაცემთა სტრუქტურა,
რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ ელემენტი.*/

class merabaList {

    class CustomList<T>: Iterable<T> {
        private var deque = ArrayDeque<T>()

        fun insert(data: T): Boolean {
            deque.add(data)
            return true
        }

        fun remove(data: T) {
            deque.remove(data)
        }

        fun get(position: Int): T {
            try {
                return deque[position]
            }catch (exception: IndexOutOfBoundsException) {
                throw exception
            }
        }

        fun size():Int{
            return deque.size
        }

        override fun iterator(): Iterator<T> = deque.iterator()

    }
}