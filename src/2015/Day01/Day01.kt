import java.io.File

fun main(args: Array<String>) {
        val path = System.getProperty("user.dir")
    println(path)
    val br = File("src/main/kotlin/Day01/Day01_input.txt").bufferedReader()

    var char: Char
    var floor = 0
    var count = 0
    var enteredBasement = false
    var firstBasement = 0
    println("Starting climb")

    while(br.ready()) {
        char = br.read().toChar()
        if (char == '(') {
            floor += 1
        } else if (char == ')') {
            floor -= 1
        }
        if (!enteredBasement && floor == -1) {
            enteredBasement = true
            firstBasement = count + 1
        }

        count += 1

        println("Read char $char On floor $floor Count: $count")
    }
    println("Done delivering")
    println("Santa stops on floor $floor, first entered basement on step $firstBasement")
}