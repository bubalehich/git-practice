package ru.clevertec;

import ru.clevertec.util.CountReader;

public class Application {
    private final static String OUTPUT_TEXT = "Hello world!";

    public static void main(String[] args) {
        var count = CountReader.read();

        for (int i = 0; i < count; i++) {
            System.out.println(OUTPUT_TEXT);
        }
    }
}