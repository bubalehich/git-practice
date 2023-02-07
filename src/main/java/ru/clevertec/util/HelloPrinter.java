package ru.clevertec.util;

public final class HelloPrinter {

    private HelloPrinter() {
    }

    public static void print(int printCount, String text) {
        if (printCount > 0) {

            for (int i = 0; i < printCount; i++) {
                System.out.println(text);
            }
        }
    }
}
