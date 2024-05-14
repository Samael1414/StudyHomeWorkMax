package com.example.study.HomeWork1;

public enum Messages {
    HOW_MANY_NUMBER("Сколько чисел вы хотите ввести ?"),
    WHAT_NUMBERS("Какие числа вы хотите ввести ?"),
    ENTER_ARRAY_SIZE("Введите размер массива"),
    ENTER_ARRAY_ELEMENTS("Введите элементы массива"),
    ARRAY_AVERAGE("Среднее число массива"),
    ENTER_STARTING("Введите начальное значение"),
    ENTER_FINAL("Введите конечное значение"),
    ENTER_STEP("Введите шаг"),
    NEGATIVE_NUMBER_ERROR("Нужно положительное число");

    private final String message;
    private static final String INVALID_INPUT_MESSAGE = "Необходимо ввести целое число!";


    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static String getInvalidInputMessage() {
        return INVALID_INPUT_MESSAGE;
    }
}
