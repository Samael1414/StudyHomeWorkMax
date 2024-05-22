package com.example.study.HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

// 1. Цикл for:
//   Напишите программу, которая просит пользователя ввести количество чисел для ввода. Затем, используя цикл for,
//   программа должна принимать числа от пользователя и выводить их сумму.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        nestedPool();
    }

    public static void cycle() {
        System.out.println(Messages.HOW_MANY_NUMBER.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
            scanner.next();
        }
        int number = scanner.nextInt();
        int sum = 0;
        boolean firsInvalid = true;
        for (int i = 0; i < number; i++) {
            System.out.println(Messages.WHAT_NUMBERS.getMessage());
            while (!scanner.hasNextInt()) {
                if (firsInvalid) System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
                scanner.next();
                firsInvalid = false;
            }
            int num = scanner.nextInt();
            firsInvalid = true;
            sum += num;
        }
        System.out.println(sum);

        scanner.close();
    }

    // Цикл for-each:
    //   Создайте программу, которая запрашивает у пользователя размер массива, а затем элементы массива.
    //   Используя цикл for-each, программа должна вычислить и вывестии среднее значение всех элементов массива.
    public static void averageValue() {
        System.out.println(Messages.ENTER_ARRAY_SIZE.getMessage());
        int size;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
                scanner.next();
                continue;
            }
            size = scanner.nextInt();
            if (size > 0) {
                break;
            } else {
                System.out.println(Messages.ARRAY_SIZE_MUST.getMessage());
            }
        }
        int[] arrayValue = new int[size];
        System.out.println(Arrays.toString(arrayValue));
        System.out.println(Messages.ENTER_ARRAY_ELEMENTS.getMessage());
        boolean firstInvalid = true;

        for (int i = 0; i < arrayValue.length; i++) {
            while (!scanner.hasNextInt()) {
                if (firstInvalid) System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
                scanner.next();
                firstInvalid = false;

            }
            arrayValue[i] = scanner.nextInt();
            firstInvalid = true;
        }
        double value = 0;
        for (int number : arrayValue) {
            value += number;
        }
        double average = value / size;
        System.out.println(Messages.ARRAY_AVERAGE.getMessage() + average);

        scanner.close();
    }

    //Цикл for с шагом:
    //   Напишите программу, которая использует цикл for с нестандартным шагом. Программа должна запрашивать
    //   начальное значение, конечное значение и шаг, затем выводить каждое `n`-ое число в этом диапазоне.

    public static void nonStandardStep() {
        System.out.println(Messages.ENTER_STARTING.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
            scanner.next();
        }
        int seedNumber = scanner.nextInt();
        System.out.println(Messages.ENTER_FINAL.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
            scanner.next();
        }
        int finalNumber = scanner.nextInt();
        System.out.println(Messages.ENTER_STEP.getMessage());
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
            scanner.next();
        }
        int step = scanner.nextInt();
        while (step <= 0) {
            System.out.println(Messages.NEGATIVE_NUMBER_ERROR.getMessage());
            scanner.hasNextInt();
            if (scanner.hasNextInt()){
                step = scanner.nextInt();
            } else {
                scanner.next();
            }
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
        System.out.println(Messages.NUMBER.getMessage());

        while (!scanner.hasNextInt()) {
            System.out.println(Messages.INVALID_INPUT_MESSAGE.getMessage());
            scanner.next();
        }
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.println(Messages.NEGATIVE_NUMBER_ERROR.getMessage());
            scanner.hasNextInt();
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
                System.out.println();
            }

        scanner.close();
    }

}
