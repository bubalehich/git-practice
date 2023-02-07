package ru.clevertec;

import ru.clevertec.util.CountReader;
import ru.clevertec.util.HelloPrinter;

public class Application {
    private final static String OUTPUT_TEXT = "Hello world!";

    public static void main(String[] args) {
        var count = CountReader.read();
        HelloPrinter.print(count, OUTPUT_TEXT);
    }
}
