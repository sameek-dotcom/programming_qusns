import java.util.Scanner;
public class sieve_prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the required no:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int prime[]=new int[n];
        int r=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=i;
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]!=0)
            {
                prime[r++]=arr[i];
            }
            for(int j=i+1;j<n;j++)
            {
                if(j%i==0 && arr[j]!=0)
                {
                    arr[j]=0;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
        System.out.println("Prime numbers are:"+prime[i]);
        }
        sc.close();
    }
}
