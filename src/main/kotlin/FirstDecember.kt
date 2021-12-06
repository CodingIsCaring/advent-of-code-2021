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

        fun findIncreasingDepthWithWindow(fileName: String): Int {
            var totalIncreased = 0
            val lines: List<String> = File(fileName).readLines()
            for ((index, currentSample) in lines.withIndex()) {
                val isSlidingWindow = index + 4 <= lines.size
                if (isSlidingWindow) {
                    val secondSample = lines[index + 1].toInt()
                    val thirdSample = lines[index + 2].toInt()
                    val fourthSample = lines[index + 3].toInt()
                    val firstDepth = currentSample.toInt() + secondSample + thirdSample
                    val secondDepth = secondSample + thirdSample + fourthSample

                    if (firstDepth < secondDepth) {
                        totalIncreased++
                    }
                }
            }
            return totalIncreased;
        }
    }

}