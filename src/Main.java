import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        System.out.println(Arrays.toString(bookCost));
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
}