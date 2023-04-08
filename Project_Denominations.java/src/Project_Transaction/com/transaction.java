package Project_Transaction.com;

import java.util.Scanner;

public class transaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of transaction array:");
        int transactionSize = scanner.nextInt();

        int[] transactions = new int[transactionSize];

        System.out.println("Enter values of array:");
        for (int i = 0; i < transactionSize; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.println("Enter total number of targets that need to be achieved:");
        int targetCount = scanner.nextInt();

        while (targetCount-- != 0) {
            boolean isTargetAchieved = false;

            System.out.println("Enter value of target:");
            long target = scanner.nextLong();

            long sum = 0;
            for (int i = 0; i < transactionSize; i++) {
                sum += transactions[i];
                if (sum >= target) {
                    System.out.println("Target achieved after " + (i + 1) + " transactions.");
                    isTargetAchieved = true;
                    break;
                }
            }

            if (!isTargetAchieved) {
                System.out.println("Given target is not achieved.");
            }
        }

        scanner.close();
    }
}
