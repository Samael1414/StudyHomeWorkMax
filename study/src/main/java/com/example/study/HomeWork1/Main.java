package com.example.study.HomeWork1;

import java.util.Scanner;

// Цикл for-each:
//   Создайте программу, которая запрашивает у пользователя размер массива, а затем элементы массива.
//   Используя цикл for-each, программа должна вычислить и вывести среднее значение всех элементов массива.
public class Main {
    public static void main(String[] args) {
        nonStandardStep();
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

    //Цикл for с шагом:
    //   Напишите программу, которая использует цикл for с нестандартным шагом. Программа должна запрашивать
    //   начальное значение, конечное значение и шаг, затем выводить каждое `n`-ое число в этом диапазоне.

    public static void nonStandardStep() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное значение: ");
        if (scanner.hasNextInt()) {
            int seedNumber = scanner.nextInt();
            System.out.println("Введите конечное значение: ");
            int finalNumber = scanner.nextInt();
            System.out.println("Введите шаг: " + " ps: Только положительное число");
            int step = scanner.nextInt();
            if (step <= 0){
                System.out.println("Ты все сломал, давай по новой!");
                return;
            }
            for (int i = seedNumber; i <= finalNumber ; i+= step) {
                System.out.println(i);
            }
        } else System.out.println("Нужны только цифры и ничего иного");
        scanner.close();
    }
}
