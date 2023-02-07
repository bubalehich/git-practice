package ru.clevertec;

public class HelloPrinter {

    public static void print(int printCount) {
        if (printCount > 0) {

            for (int i = 0; i < printCount; i++) {
                System.out.println("Hello world!");
            }
        }
    }
}
