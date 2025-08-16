import java.util.Scanner;
public class diagonal_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the square matrix:");
        int n=sc.nextInt();
        System.out.println("enter the elements of array:\n");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int left_sum=0;
        int right_sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    left_sum=left_sum+a[i][j];
                }
                if((i+j)==n-1)
                {
                    right_sum=right_sum+a[i][j];
                }
            }
        }
        System.out.println("sum of left diagonal is:"+left_sum);
        System.out.println("sum of left diagonal is:"+right_sum);
        sc.close();
    }
}