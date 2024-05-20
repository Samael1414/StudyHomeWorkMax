package com.example.study.HomeWork1;

import java.util.Scanner;

// 1. Цикл for:
//   Напишите программу, которая просит пользователя ввести количество чисел для ввода. Затем, используя цикл for,
//   программа должна принимать числа от пользователя и выводить их сумму.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     cycle();
    }

    public static void cycle() {
        System.out.println(Messages.HOW_MANY_NUMBER.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println(Messages.WHAT_NUMBERS.getMessage());
            if (!scanner.hasNextInt()) {
                System.out.println(Messages.getInvalidInputMessage());
                scanner.nextLine();
                continue;
            }
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);

        scanner.close();
    }

    // Цикл for-each:
    //   Создайте программу, которая запрашивает у пользователя размер массива, а затем элементы массива.
    //   Используя цикл for-each, программа должна вычислить и вывести среднее значение всех элементов массива.
    public static void averageValue() {
        System.out.println(Messages.ENTER_ARRAY_SIZE.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
            int size = scanner.nextInt();
            int[] arrayValue = new int[size];
            System.out.println(Messages.ENTER_ARRAY_ELEMENTS.getMessage());

            for (int i = 0; i < arrayValue.length; i++) {
                while (!scanner.hasNextInt()) {
                    System.out.println(Messages.getInvalidInputMessage());
                    scanner.nextLine();
                }
                arrayValue[i] = scanner.nextInt();
            }
            double value = 0;
            double quantity = 0;
            for (int number : arrayValue) {
                value += number;
                quantity++;
            }
            double average = value / quantity;
            System.out.println(Messages.ARRAY_AVERAGE.getMessage() + average);

        scanner.close();
    }

    //Цикл for с шагом:
    //   Напишите программу, которая использует цикл for с нестандартным шагом. Программа должна запрашивать
    //   начальное значение, конечное значение и шаг, затем выводить каждое `n`-ое число в этом диапазоне.

    public static void nonStandardStep() {
        System.out.println(Messages.ENTER_STARTING.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
        int seedNumber = scanner.nextInt();
        System.out.println(Messages.ENTER_FINAL.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
        int finalNumber = scanner.nextInt();
        System.out.println(Messages.ENTER_STEP.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
        int step = scanner.nextInt();
        while (step <= 0) {
            System.out.println(Messages.NEGATIVE_NUMBER_ERROR.getMessage());
            scanner.nextLine();
            step = scanner.nextInt();
        }
        for (int i = seedNumber; i <= finalNumber; i += step) {
            System.out.println(i);
        }

        scanner.close();
    }

    //4. Вложенные циклы for:
    //   Разработайте программу, которая использует вложенные циклы for для создания таблицы умножения
    //   заданного размера. Пользователь должен ввести размер таблицы, а программа должна выводить
    //   таблицу умножения для чисел от 1 до введенного числа.
    public static void nestedPool() {
        System.out.println(Messages.ENTER_ARRAY_SIZE.getMessage());

        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
