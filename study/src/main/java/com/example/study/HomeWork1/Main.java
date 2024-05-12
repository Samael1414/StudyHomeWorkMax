package com.example.study.HomeWork1;

import java.util.Scanner;

// Цикл for-each:
//   Создайте программу, которая запрашивает у пользователя размер массива, а затем элементы массива.
//   Используя цикл for-each, программа должна вычислить и вывести среднее значение всех элементов массива.
public class Main {
    public static void main(String[] args) {
        averageValue();
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

    public static void averageValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int[] arrayValue = new int[size];
            System.out.println("Введите элементы массива");

            for (int i = 0; i < arrayValue.length; i++) {
                if (scanner.hasNextInt()) {
                    arrayValue[i] = scanner.nextInt();
                } else {
                    System.out.println("Мне нужны цифры, а не вот это все!");
                }
            }
            int value = 0;
            int quantity = 0;
            for (int number : arrayValue) {
                value += number;
                quantity++;
            }
            double average = value / quantity;
            System.out.println("Среднее число массива: " + average);
        }
        scanner.close();
    }
}
