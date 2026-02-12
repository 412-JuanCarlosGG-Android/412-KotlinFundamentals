package com.example.kotlinfundamentals2

import org.junit.Test

class ListsTest {

    @Test
    fun findMaxNumber() {
        val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 23, 12)
        var maxNumber = numbers[0]

        for (number in numbers) {
            if (number > maxNumber) {
                maxNumber = number
            }
        }

        println("El número mas grande es $maxNumber")
    }
}