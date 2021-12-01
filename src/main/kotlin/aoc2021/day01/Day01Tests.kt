package aoc2021.day01

import org.junit.Assert
import org.junit.Test

val input = """
    199
    200
    208
    210
    200
    207
    240
    269
    260
    263
""".trimIndent()

class Day01Tests {


    @Test
    fun testDay01() {
        val intInput = convertInput1(input)
        val result = measureChanges(intInput, 1)
        Assert.assertEquals(7, result.first)
    }

    @Test
    fun testDay01Size3Window() {
        val intInput = convertInput1(input)
        val result = measureChanges(intInput, 3)
        Assert.assertEquals(5, result.first)
    }
}