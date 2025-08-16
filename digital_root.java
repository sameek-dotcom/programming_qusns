class digital_root
{
    public static void main(String args[])
    {
        int n=23;
        
        while(n>=10)
        {
            int sum=0;
            while(n!=0)
            {
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
        n=sum;
    }
        System.out.println("Digital Root of the number is "+n);
    }
}
