import java.util.Scanner;

public class number_nondigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower limit:\n");
        int l = sc.nextInt();
        System.out.println("enter the upper limit:\n");
        int u = sc.nextInt();
        System.out.println("enter the no of nonzero digits:\n");
        int k = sc.nextInt();
        int count = 0;
        int t_count = 0;
        for (int i = l + 1; i <= u; i++) {
            int num = i;
            count = 0;
            while (num != 0) {
                if ((num % 10) != 0) {
                    count++;
                }
                num = num / 10;
            }
            if (count == k) {
                t_count++;
            }

        }
        System.out.println("The total no of non digit numbers based on k values: " + t_count);
        sc.close();
    }

}