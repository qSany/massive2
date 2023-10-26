public class Main {
    public static void main(String[] args) {

        task();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task() {
        int[] arr = generateRandomArray();
        double[] payments = {5000.50, 12345.00, -3434.34, 0, 560.87, -1000.00};
        double total = 0.0;
        for (double payment : payments)
            total += payment;

        System.out.println("Сумма выплат за месяц составляет " + total + "рублей");

    }
    public static void task1() {
        int[] payments = generateRandomArray();
        double averageSpend = 0;
        for (int i = 0; i < payments.length; i++) {
            averageSpend += payments[i];
            averageSpend /= payments.length;
            System.out.println("Средняя сумма трат за месяц: " + averageSpend + " рублей");
        }


        public static void task2 () {
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











