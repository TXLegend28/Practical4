import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        System.out.println("Enter 5 numbers (10 - 100 inclusive):");

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = scanner.nextInt();


            if (num < 10 || num > 100) {
                System.out.println("Number must be between 10 and 100. Try again.");
                continue;
            }


            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                numbers[count] = num;
                count++;
                System.out.println("Added: " + num);
            } else {
                System.out.println(num + " is a duplicate. Not added.");
            }

            // Display current unique values after each input
            System.out.print("Current unique values: ");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("\n");
        }


        System.out.println("\n Final Unique Values ");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

    }
}