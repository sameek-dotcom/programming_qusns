import java.util.Scanner;
public class given_arms {
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int original=sc.nextInt();
        int n1=original;
        while(n1!=0)
        {
            int n=String.valueOf(original).length();
            int rem=n1%10;
            sum+=(int)Math.pow(rem,n);
            n1=n1/10;
        }
        if(sum==original)
        {
            System.out.println("given no is armstrong number");
        }
        else
            System.out.println("it is not a armstong number");
        sc.close();
    }
}

