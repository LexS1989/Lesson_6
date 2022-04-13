package ru.skypro;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задача №1
        int[] arr = generateRandomArray();

        // Метод 1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей.");

        // Метод 2 (проверка)
        int check = 0;
        for (int i : arr) {
            check += i;
        }
        System.out.println("Проверочное значение: " + check + " рублей.");

        // Задача №2
        int max = 0;
        int min = 100_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
//            System.out.println(arr[i]);
        }
        System.out.println("Минимальная сумма трат за день составила: " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила: " + max + " рублей.");

        // Задача №3
        float month = arr.length;
        float meanSpending = sum / month;
        System.out.println("Средняя сумма трат за месяц составила: " + meanSpending + " рублей.");

        // Задача №4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        System.out.println(reverseFullName);
        char name = 0;
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            name = reverseFullName[i];
            System.out.print(name);
        }
    }
}
