package Day02

class WrappableBox(val length: Int, val width: Int, val height: Int): WrappableObject {
    val side1: Int
    val side2: Int
    val side3: Int
    val smallestSide: Int
    val smallestPerimeter: Int

    init {
        side1 = length * width
        var calculatingSmallest = side1
        side2 = width * height
        if (side2 < calculatingSmallest) {
            calculatingSmallest = side2
        }
        side3 = height * length
        if (side3 < calculatingSmallest) {
            calculatingSmallest = side3
        }
        smallestSide = calculatingSmallest
        var array = arrayOf(length, width, height)
        array.sort()
        var smalles1: Int = array[0]
        var smallest2: Int = array[1]
        smallestPerimeter = smalles1 * 2 + smallest2 * 2 // TODO: There is 100% a better way to handle this
    }

    fun surfaceArea(): Int {
        return 2 * side1 + 2 * side2 + 2 * side3
    }

    fun volume(): Int {
        return length * width * height
    }

    override fun requiredWrappingPaper(): Int { // TODO: Could this use kotlins get stuff
        return surfaceArea() + smallestSide
    }

    override fun requiredRibbon(): Int {
        return volume() + smallestPerimeter
    }
}