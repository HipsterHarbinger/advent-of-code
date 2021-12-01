package Day03

import java.io.BufferedReader

class Day03Map {
    var startingPoint: House = House()
    var currentHouse: House = startingPoint
//    var width: Int = 1
//    var height: Int = 1 TODO: It's unlikely this will end up as a rectange
    var count: Int = 1

    fun goNorth() {
        if (currentHouse.north != null) { // TODO: See if there's better type safety
            currentHouse = currentHouse?.north as House
            currentHouse.presents += 1
        } else {
            println("adding north house")
            currentHouse.north = House(south = currentHouse)
            currentHouse = currentHouse?.north as House
            count += 1
        }
    }

    fun goEast() {
        if (currentHouse.east != null) { // TODO: See if there's better type safety
            currentHouse = currentHouse?.east as House
            currentHouse.presents += 1
        } else {
            currentHouse.east = House(west = currentHouse)
            currentHouse = currentHouse?.east as House
            count += 1
        }
    }

    fun goSouth() {
        if (currentHouse.south != null) { // TODO: See if there's better type safety
            currentHouse = currentHouse?.south as House
            currentHouse.presents += 1
        } else {
            println("adding south house")
            currentHouse.south = House(north = currentHouse)
            currentHouse = currentHouse?.south as House
            count += 1
        }
    }

    fun goWest() {
        if (currentHouse.west != null) { // TODO: See if there's better type safety
            currentHouse = currentHouse?.west as House
            currentHouse.presents += 1
        } else {
            currentHouse.west = House(east = currentHouse)
            currentHouse = currentHouse?.west as House
            count += 1
        }
    }

    fun readInput(br: BufferedReader) {
        while(br.ready()) {
            val char = br.read()
            when (char) {
                'v'.toInt() -> goSouth()
                '^'.toInt() -> goNorth()
                '>'.toInt() -> goEast()
                '<'.toInt() -> goWest()
                else -> print("Do Nothing")// TODO: Probably a better way to do this
            }
        }
    }

}