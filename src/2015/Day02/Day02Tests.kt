import Day02.WrappableBox
import Day02.WrappableObject
import junit.framework.Assert.assertEquals
import org.junit.Test

class Day02Tests {

    @Test
    fun test01() {
        var object1 = WrappableBox(2, 3, 4)
        assertEquals(object1.requiredWrappingPaper(), 58)
        assertEquals(object1.requiredRibbon(), 34)
    }

    @Test
    fun test02() {
        var object2 = WrappableBox(1, 1, 10)
        assertEquals(object2.requiredWrappingPaper(), 43)
        assertEquals(object2.requiredRibbon(), 14)
    }
}