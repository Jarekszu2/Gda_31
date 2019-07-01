package jvm2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        int liczba = 0;
        do {
            while (!scanner.hasNextInt()) {
               System.out.println("Podaj liczbę!");
               scanner.next();
            }
            liczba = scanner.nextInt();
            if (liczba > 0 && liczba < 10) {
                flag = true;
            }
        } while (!flag);
        for (int i = 0; i < liczba; i++) {
            System.out.println("Hallo World!");
        }
    }
}
