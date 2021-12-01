package Day03

import junit.framework.Assert.assertEquals
import org.junit.Test
import java.io.BufferedReader
import java.io.File

class Day03Tests {

    @Test
    fun Test01() {
        val br = File("src/main/kotlin/Day03/Day03_test_input1.txt").bufferedReader()
        val map = Day03Map()
        map.readInput(br)
        assertEquals(map.count, 2)
    }

    @Test
    fun Test02() {
        val br = File("src/main/kotlin/Day03/Day03_test_input2.txt").bufferedReader()
        val map = Day03Map()
        map.readInput(br)
        assertEquals(map.count, 4)
    }

    @Test
    fun Test03() {
        val br = File("src/main/kotlin/Day03/Day03_test_input3.txt").bufferedReader()
        val map = Day03Map()
        map.readInput(br)
        assertEquals(map.count, 2)
    }
}