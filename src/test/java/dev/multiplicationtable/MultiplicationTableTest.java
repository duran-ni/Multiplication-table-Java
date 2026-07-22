package dev.multiplicationtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MultiplicationTableTest {

    private final MultiplicationTable table = new MultiplicationTable();

    @Test
void shouldGenerateTableForSeven() {
    String expected =
        "7 x 1 = 7" + System.lineSeparator() +
        "7 x 2 = 14" + System.lineSeparator() +
        "7 x 3 = 21" + System.lineSeparator() +
        "7 x 4 = 28" + System.lineSeparator() +
        "7 x 5 = 35" + System.lineSeparator() +
        "7 x 6 = 42" + System.lineSeparator() +
        "7 x 7 = 49" + System.lineSeparator() +
        "7 x 8 = 56" + System.lineSeparator() +
        "7 x 9 = 63" + System.lineSeparator() +
        "7 x 10 = 70" + System.lineSeparator();

    assertEquals(expected, table.generate(7));
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

     @Test
    void shouldPrintTableForSeven() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        table.print(7);

        System.setOut(originalOut);
        assertEquals(table.generate(7), outputStream.toString());
    }
}