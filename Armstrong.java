
public class Armstrong {
    public static void main(String args[])
    {
        for(int i=101;i<=999;i++)
        {
            int n=3;
            int sum=0;
            int original=i;
        while(original!=0)
        {
            
            int rem=original%10;
            sum+=(int)Math.pow(rem,n);
            original=original/10;
        }
        if(sum==i)
        {
            System.out.println("Therefore the armstrong numbers are:" +i);
        }
    }

    }
}
