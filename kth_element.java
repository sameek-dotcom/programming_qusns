import java.util.*;
public class kth_element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the matrix:");
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        int arr[]=new int[n*n];
        System.out.println("Enter the elements pf the matrix:");
        int m=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
                arr[m++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the kth element which you want to find:");
        int k=sc.nextInt();
        for(int i=0;i<n*n;i++)
        {
            if(i==k-1)
            {
                System.out.println("The " + k + "th smallest element is: " + arr[i]);
                break;
            }
        }
        sc.close();
    }
}