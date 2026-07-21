package dev.multiplicationtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableTest {

    private final MultiplicationTable table = new MultiplicationTable();

    @Test
    void shouldGenerateTableForFive() {
        String expected =
            "5 x 1 = 5" + System.lineSeparator() +
            "5 x 2 = 10" + System.lineSeparator() +
            "5 x 3 = 15" + System.lineSeparator() +
            "5 x 4 = 20" + System.lineSeparator() +
            "5 x 5 = 25" + System.lineSeparator() +
            "5 x 6 = 30" + System.lineSeparator() +
            "5 x 7 = 35" + System.lineSeparator() +
            "5 x 8 = 40" + System.lineSeparator() +
            "5 x 9 = 45" + System.lineSeparator() +
            "5 x 10 = 50" + System.lineSeparator();

        assertEquals(expected, table.generate(5));
    }

    @Test
    void shouldHandleOne() {
        assertEquals("1 x 1 = 1" + System.lineSeparator(),
            table.generate(1).lines().findFirst().get() + System.lineSeparator());
    }

    @Test
    void shouldHandleZero() {
        assertEquals("0 x 1 = 0" + System.lineSeparator(),
            table.generate(0).lines().findFirst().get() + System.lineSeparator());
    }

    @Test
    void shouldHandleNegativeNumber() {
        assertEquals("-3 x 1 = -3" + System.lineSeparator(),
            table.generate(-3).lines().findFirst().get() + System.lineSeparator());
    }
}