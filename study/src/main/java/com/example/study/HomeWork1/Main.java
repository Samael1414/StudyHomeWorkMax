package com.example.study.HomeWork1;

import java.util.Scanner;

// 1. Цикл for:
//   Напишите программу, которая просит пользователя ввести количество чисел для ввода. Затем, используя цикл for,
//   программа должна принимать числа от пользователя и выводить их сумму.
public class Main {
    public static void main(String[] args) {
        nestedPool();
    }

    // 1 обрати внимание на то что тебе идея подсказывает что у тебя есть дубликаты когда со сканером. ты уже с
    // подобным сталкивался, подумай как это исправить.
    //--------------------------------------------------------------------------------------------
    //2. первая задача при запуске в случае если вводишь слово а не цифры выкидывает два раза ошибку. внизу то что получется. исправь

    //Сколько чисел вы хотите ввести ?
    //4
    //Какие числа вы хотите ввести ?
    //fg
    //Необходимо ввести целое число!
    //Какие числа вы хотите ввести ?
    //Необходимо ввести целое число!
    //Какие числа вы хотите ввести ?
    //-_______________________________________________________________________________________________________


    public static void cycle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Messages.HOW_MANY_NUMBER.getMessage());
        int number = 0;
        while (!scanner.hasNextInt()) {
            System.out.println(Messages.getInvalidInputMessage());
            scanner.nextLine();
        }
        number = scanner.nextInt();
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

        //в этой задаче так же дублируется если ввести буквы а не цифры


        Scanner scanner = new Scanner(System.in);
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

        //Введите начальное значение
        //па
        //Необходимо ввести целое число!
        //то
        //Необходимо ввести целое число!
        //5
        //Введите конечное значение
        //ипор
        //Необходимо ввести целое число!
        //Необходимо ввести целое число!

        //тоже самое

        Scanner scanner = new Scanner(System.in);
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

// задача решена не так. пример если выбираешь 4 то вывод в консоль должно быть
        // 1 * 1 = 1
        //1 * 2 = 2
        //1 * 3 = 3
        //1 * 4 = 4
        //1 * 5 = 5
        //1 * 6 = 6
        //1 * 7 = 7
        //1 * 8 = 8 и тд до 10

        //пототм так же
        // 2 * 1 = 2
        //2 * 2 = 4 и тд

        // и так для всех цифр до 4 так как ты выбрала в самом начале цифру 4

        Scanner scanner = new Scanner(System.in);
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
