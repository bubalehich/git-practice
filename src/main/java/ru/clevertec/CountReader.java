package ru.clevertec;

import java.util.Scanner;

public class CountReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int read() {
        System.out.println("Insert count:");
        var count = scanner.nextLine();

        try {
            return Integer.parseInt(count);
        } catch (Exception e) {
            return 0;
        }
    }
}
