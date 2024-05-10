package com.example.study.HomeWork1;

import java.util.Scanner;

// Цикл for:
//   Напишите программу, которая просит пользователя ввести количество чисел для ввода. Затем, используя цикл for, \
//   программа должна принимать числа от пользователя и выводить их сумму.
public class Main {
    public static void main(String[] args) {
        cycle();
    }

    public static void cycle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int[] numbers = new int[number];
            System.out.println("Какие числа вы хотите ввести?");
            for (int i = 0; i < numbers.length; i++) {
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                } else System.out.println("Вводите именно числа!");
            }
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("Сумма ваших чисел = " + sum);
        }
        scanner.close();
    }
}
