package main.kotlin

import java.io.File

class SecondDecember {

    private var depth: Int = 0
    private var horizontalPosition: Int = 0

    fun calculatePosition(filePath: String): Int {
        val lines: List<String> = File(filePath).readLines()
        lines.forEach { line ->
            val nextMove = line.split(" ")
            val direction = nextMove[0]
            val units = nextMove[1].toInt()

            updatePosition(direction, units)
        }
        return horizontalPosition * depth
    }

    private fun updatePosition(direction: String, units: Int) {
        when (direction) {
            "forward" -> horizontalPosition += units
            "down" -> depth += units
            else -> depth -= units
        }
    }
}