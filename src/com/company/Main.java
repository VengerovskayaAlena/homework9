package com.company;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println ("Сумма трат за месяц составила " + sum + " рублей");
        }

    public static void task2() {
        int[] arr = generateRandomArray();
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int arrMax = 0;
        int arrMin = arr[1];
        for (int i = 0; i < arr.length; i++){
            if (arrMin > arr[i]) {
                arrMin = arr[i];
            } else {
                arrMin = arrMin ;
            }}
        for (int a = 0; a < arr.length; a ++){
            if (arrMax < arr[a]) {
                arrMax = arr[a];
            } else {
                arrMax = arrMax ;
            }}
        System.out.println("Минимальная сумма трат за день составила " + arrMin + " рублей. Максимальная сумма трат за день составила " + arrMax + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        double mean = sum/30;
        System.out.println("Средняя сумма трат за месяц составила "+ mean +" рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
