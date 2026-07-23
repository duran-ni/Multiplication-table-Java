package dev.multiplicationtable;
import java.util.ArrayList;
import java.util.List;

/**
 * Responsable de generar la tabla de multiplicar de un número entero.
 */
public class MultiplicationTable {

    // Genera la tabla del 1 al 10 y la devuelve como texto (una línea por múltiplo)
    public String generate(int number) {
        List<String> lines = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            lines.add(number + " x " + i + " = " + (number * i));
        }

        return String.join(System.lineSeparator(), lines) + System.lineSeparator();
    }
     

    public void print(int number) {
        System.out.print(generate(number));
    }
}