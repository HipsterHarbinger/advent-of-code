import Day02.WrappableBox
import Day02.WrappableObject
import java.io.File

fun main(args: Array<String>) {
    val br = File("src/main/kotlin/Day02/Day02_input.txt").bufferedReader()
    var wrappableObjects: MutableList<WrappableObject> = mutableListOf<WrappableObject>()

    while(br.ready()) {
        val line = br.readLine()
        val (width, height, length) = line.split('x')
        wrappableObjects.add(WrappableBox(width.toInt(), height.toInt(), length.toInt()))
    }
    var totalWrappingPaperNeeded = 0
    var totalRibbonNeeded = 0
    wrappableObjects.forEach {
        totalWrappingPaperNeeded += it.requiredWrappingPaper()
        totalRibbonNeeded += it.requiredRibbon()
    }
    println("Total wrapping paper needed $totalWrappingPaperNeeded ft")
    println("Total ribbon needed $totalRibbonNeeded ft")
}