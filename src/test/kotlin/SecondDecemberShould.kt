package test.kotlin

import main.kotlin.SecondDecember
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SecondDecemberShould {

    @Test
    fun `calculate position in file`() {
        assertEquals(1604850, SecondDecember().calculatePosition("src/main/resources/plannedPosition.txt"))
    }
    @Test
    fun `calculate position in file with aim`() {
        assertEquals(1685186100, SecondDecember().calculatePositionWithAim("src/main/resources/plannedPosition.txt"))
    }
}