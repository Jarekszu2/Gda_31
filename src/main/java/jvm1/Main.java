package jvm1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;
        while (isWorking) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("sto") || line.equalsIgnoreCase("100")) {
                isWorking = false;
                continue;
            }
            System.out.println("Hallo World!");
        }

        System.out.println("aa");

    }
}
