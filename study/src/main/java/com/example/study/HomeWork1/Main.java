package com.example.study.HomeWork1;

import java.util.Scanner;

// Цикл for-each:
//   Создайте программу, которая запрашивает у пользователя размер массива, а затем элементы массива.
//   Используя цикл for-each, программа должна вычислить и вывести среднее значение всех элементов массива.
public class Main {
    public static void main(String[] args) {
        cycle();
    }


    // 1. раз уж начал то напиши перед каждым решением задачи их условия. и на следующих задачах делай так же.
    // 2. создай Enum с перечислениями всех сообщений которые ты используешь в System.out.println и используй их в выводе в консоль. Пример: HOW_MANY_NUMBER("Сколько чисел вы хотите ввести?")
    //    и тд. это хорошая практика не хардкодить текст ошибок и пр текстов а заносить их в enum для последующего использования. Как раз практика Enum будет.
    // 3. проверил первую задачу у себя локально, перепроверь тоже как выполняется программа!

    public static void cycle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        if (scanner.hasNextInt()) {
            // 3.1 условие не отрабатывает, если тут ввести буквы то ничего не происходит. проверь каждую из задач, if отрабатывает один раз
            // а должно быть пока не введешь число должно выкидывать сообщение что нужно вводить только число
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
            // 3.2 тут тоже самое
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
            // 3.3 тут та же штука
            int seedNumber = scanner.nextInt();
            System.out.println("Введите конечное значение: ");
            int finalNumber = scanner.nextInt();
            System.out.println("Введите шаг: " + " ps: Только положительное число");
            int step = scanner.nextInt();
            if (step <= 0){
                System.out.println("Ты все сломал, давай по новой!");
                // тут ухаха
                return;
            }
            for (int i = seedNumber; i <= finalNumber ; i+= step) {
                System.out.println(i);
            }
        } else System.out.println("Нужны только цифры и ничего иного");
        scanner.close();
    }
}
