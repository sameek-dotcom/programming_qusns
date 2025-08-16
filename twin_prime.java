import java.util.Scanner;
public class twin_prime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        boolean found = false;
        for (int i = 2; i<n; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No twin primes found less than " + n);
        }
        sc.close();
    }
}
