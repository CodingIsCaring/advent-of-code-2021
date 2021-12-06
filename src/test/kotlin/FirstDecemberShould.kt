package test.kotlin

import main.kotlin.FirstDecember
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstDecemberShould {

    @Test
    fun `find increasing depths in file`() {
        assertEquals(1288, FirstDecember.findIncreasingDepth("src/main/resources/scannedDepth.txt"))
    }

    @Test
    fun `find increasing depths in file with windows`() {
        assertEquals(1311, FirstDecember.findIncreasingDepthWithWindow("src/main/resources/scannedDepth.txt"))
    }

}