package aoc2021.day02

import org.junit.Assert
import org.junit.Test

class Day02Test {

    val input = """
        forward 5
        down 5
        forward 8
        up 3
        down 8
        forward 2
    """.trimIndent()

    @Test
    fun testQuestion1() {
        val position = getPosition(parseInputs(input))
        Assert.assertEquals(150, position.first * position.second)
    }

    @Test
    fun testQuestion2() {
        val position = getAimPosition(parseInputs(input))
        Assert.assertEquals(900, position.first * position.second)
    }
}