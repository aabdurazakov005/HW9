import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] paymentsOne = new int[5];
        paymentsOne[0] = 12500;
        paymentsOne[1] = 13400;
        paymentsOne[2] = 27950;
        paymentsOne[3] = 18670;
        paymentsOne[4] = 31890;
        int sum = 0;
        for (int i = 0; i < paymentsOne.length; i++) {
            sum += paymentsOne[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println(" ");

        System.out.println("Task 2");
        int[] paymentsTwo = new int[]{17845, 18234, 28477, 47856, 37745};
        int maxPayment = paymentsTwo[0];
        int minPayment = paymentsTwo[0];
        for (int i = 1; i < paymentsTwo.length; i++) {
            if (paymentsTwo[i] < minPayment) {
                minPayment = paymentsTwo[i];
            }
            if (paymentsTwo[i] > maxPayment) {
                maxPayment = paymentsTwo[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayment + " рублей.");
        System.out.println(" ");

        System.out.println("Task 3");
        int[] paymentsForWeek = new int[]{23355, 43252, 35634, 18449, 34157};
        int paymentsForMonth = 0;
        for (int i : paymentsForWeek) {
            paymentsForMonth += i;
        }
        double paymentsMiddle = (double) paymentsForMonth / paymentsForWeek.length;
        System.out.println("Средняя сумма трат за месяц составила " + paymentsMiddle + " рублей");
        System.out.println(" ");

        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i-- ) {
            System.out.print(reverseFullName[i]);
        }
    }
}