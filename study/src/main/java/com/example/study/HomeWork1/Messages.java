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
    NEGATIVE_NUMBER_ERROR("Нужно положительное число"),
    INVALID_INPUT_MESSAGE("Необходимо ввести целое число!"),
    ARRAY_SIZE_MUST("Размер массива должен быть положительным"),
    NUMBER("Введите число");

    private final String message;



    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
