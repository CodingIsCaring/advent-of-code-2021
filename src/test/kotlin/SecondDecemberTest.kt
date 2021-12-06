package test.kotlin

import main.kotlin.SecondDecember
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SecondDecemberTest {

    @Test
    fun test1() {
        assertEquals(1604850, SecondDecember().calculatePosition("src/main/resources/plannedPosition.txt"))
    }
}