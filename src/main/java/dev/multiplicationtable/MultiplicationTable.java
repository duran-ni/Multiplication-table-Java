package dev.multiplicationtable;

/**
 * Responsable de generar la tabla de multiplicar de un número entero.
 */
public class MultiplicationTable {

    // Genera la tabla del 1 al 10 y la devuelve como texto (una línea por múltiplo)
    public String generate(int number) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            table.append(number)
                 .append(" x ")
                 .append(i)
                 .append(" = ")
                 .append(number * i)
                 .append(System.lineSeparator());
        }
        return table.toString();
    }

    public void print(int number) {
        System.out.print(generate(number));
    }
}