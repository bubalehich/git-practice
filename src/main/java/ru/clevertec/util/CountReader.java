package ru.clevertec.util;

import java.util.Scanner;

public final class CountReader {
    private static final Scanner scanner = new Scanner(System.in);

    private CountReader() {
    }

    public static int read() {
        System.out.println("Insert count:");
        var count = scanner.nextLine();

        try {
            return Integer.parseInt(count);
        } catch (Exception ex) {
            return 0;
        }
    }
}
