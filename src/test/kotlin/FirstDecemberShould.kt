package test.kotlin

import main.kotlin.FirstDecember
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstDecemberShould {
    @Test
    fun testFixed() {
        val file = IntArray(1){2}
        assertEquals(2, FirstDecember.findIncreasingDepth(file))
    }

}