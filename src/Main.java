public class Main {


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
        double[] payments = {5000.50, 12345.00, -3434.34, 0, 560.87, -1000.00};
        double total = 0.0;
        for (double payment : payments) ;
        total += payment;

        System.out.println("Сумма выплат за месяц составляет " + total + "рублей");
    }

    public static void task2() {
        double[] transactions = {100.23, -20.12, 56.00, 123.45, -98.76, 78.90};
        double min = transactions[0];
        double max = transactions[0];

        for (double d : transactions) {
            if (d < min) min = d;
            if (d > max) max = d;

        System.out.printf("Минимальная сумма трат за день составила" + min + "рублей",
                "Максимальная сумма трат за день составила" + max + "рублей");

    }

    public static void task3() {
        int[] payments = generateRandomArray();
        double averageSpend = 0;
        for (int i = 0; i < payments.length; i++) {
            averageSpend += payments[i];
            averageSpend /= payments.length;
            System.out.println("Средняя сумма затрат за месяц: " + averageSpend + " рублей");

        }

        public static void task4 () {
            int[] reverseFullName = generateRandomArray();
            char[] reverseFullName1 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            String result = "";
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                result = reverseFullName[i] + result;
            }
            System.out.println(result);
        }
    }
}











