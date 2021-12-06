package main.kotlin

import java.io.File

class FirstDecember {

    companion object {
        fun findIncreasingDepth(fileName: String): Int {
            var totalIncreased = 0
            val lines: List<String> = File(fileName).readLines()
            for ((index, currentDepth) in lines.withIndex()) {
                if (index > 0 && lines[index - 1].toInt() < currentDepth.toInt()) {
                    totalIncreased++
                }
            }
            return totalIncreased;
        }
    }

}