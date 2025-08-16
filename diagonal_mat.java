import java.util.Scanner;
import java.util.*;

public class diagonal_mat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix:");
        int m = sc.nextInt();
        System.out.println("enter the elements of thge matrix");
        int mat[][] = new int[m][m];
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int sum = 0; sum <= 2 * (m - 1); sum++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + j) == sum) {
                        ls.add(mat[j][i]);
                    }
                }
            }
        }
        for (int val : ls) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
