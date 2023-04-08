package denominationsproject.com;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class project_denomination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input of denominations
        System.out.print("Enter size of denominations: ");
        int numOfDenominations = scanner.nextInt();
        int[] denominations = new int[numOfDenominations];
        System.out.println("Enter denominations value: ");
        for (int i = 0; i < numOfDenominations; i++) {
            try {
                denominations[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for denominations value. Please try again.");
                return;
            }
        }

        // Take input of amount to pay
        System.out.print("Enter amount you want to pay: ");
        int amountToPay;
        try {
            amountToPay = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for amount to pay. Please try again.");
            return;
        }

        // Sort the denominations in descending order
        Arrays.sort(denominations);
        reverseArray(denominations);

        // Calculate payment approach
        int[] numOfNotes = new int[numOfDenominations];
        for (int i = 0; i < numOfDenominations; i++) {
            numOfNotes[i] = amountToPay / denominations[i];
            amountToPay %= denominations[i];
        }

        // Print payment approach
        System.out.println("Your payment approach in order to give min no of notes is");
        for (int i = 0; i < numOfDenominations; i++) {
            if (numOfNotes[i] > 0) {
                System.out.println(denominations[i] + ":" + numOfNotes[i]);
            }
        }
    }

    // Helper method for reversing array
    public static void reverseArray(int[] arr) {
        int numOfElements = arr.length;
        for (int i = 0; i < numOfElements / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[numOfElements - i - 1];
            arr[numOfElements - i - 1] = temp;
        }
    }
}

    
     




