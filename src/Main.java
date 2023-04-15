import java.util.Arrays;

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
        int[] bookCost = generateRandomArray();
        System.out.println("Задача 1");
        int totalCost = 0;
        for (int i = 0; i < bookCost.length; i++) {
            totalCost += bookCost[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalCost + " рублей.");
    }

    public static void task2() {
        int[] bookCost = generateRandomArray();
        System.out.println();
        System.out.println("Задача 2");
        int maxCost = -1;
        int minCost = 200_001;
        for (int i : bookCost) {
            if (i > maxCost) {
                maxCost = i;
            } else if (i < minCost) {
                minCost = i;
            }
        }
        System.out.println("Минимальная сумма трат составила " + minCost + " рублей.");
        System.out.println("Максимальная сумма трат составила " + maxCost + " рублей.");
    }

    public static void task3() {
        int[] bookCost = generateRandomArray();
        System.out.println();
        System.out.println("Задача 3");
        int totalCost = 0;
        for (int i : bookCost) {
            totalCost += i;
        }
        double averageCost = (double)totalCost / bookCost.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageCost);
    }

    public static void task4() {
        System.out.println();
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}