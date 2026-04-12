import java.util.Scanner;

public class InputLineSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline after n

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid Input");
                return;
            }
            arr[i] = sc.nextInt();
            sc.nextLine(); // consume newline after each number
        }

        // ✅ Now check if extra input exists AFTER reading all n numbers
        if (sc.hasNextInt()) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println(sum);
    }
}