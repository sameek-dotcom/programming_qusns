import java.util.Scanner;

public class AP_GP {
    public static String isAP_GP(int arr[], int n) {
        if (n < 2) {
            return "Not enough elements";
        }

        boolean isAP = true;
        boolean isGP = true;

        int diff = arr[1] - arr[0];
        double ratio = (arr[0] != 0) ? ((double) arr[1] / arr[0]) : 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                isAP = false;
            }

            if (arr[i] == 0 || (double) arr[i + 1] / arr[i] != ratio) {
                isGP = false;
            }
        }

        if (isAP) return "Arithmetic Progression";
        if (isGP) return "Geometric Progression";
        return "Not in Progression";
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isAP_GP(arr, n));
        sc.close();
    }
}
