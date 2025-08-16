import java.util.Scanner;
public class diagonal_above
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
        int bottom_sum=0;
        int up_sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    bottom_sum=bottom_sum+a[i][j];
                }
                if(i<j)
                {
                    up_sum=up_sum+a[i][j];
                }
            }
        }
        System.out.println("sum of all number below diagonal is:"+bottom_sum);
        System.out.println("sum of all number above diagonal is:"+up_sum);
        sc.close();
    }
}