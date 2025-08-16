public class prgrm4 {
    public static void main(String args[])
    {
        int p[] = {30, 45, 25, 60, 20};
        int count=0;
        for(int i=0;i<p.length-1;i++)
        {
            for(int j=i+1;j<p.length;j++)
            {
                if(p[i]>p[j])
                {
                    if(i<j)
                    {
                        count++;
                        System.out.println("Pair found: (" + p[i] + ", " + p[j] + ")");
                    }
                }
            }
        }
        System.out.println("Total pairs found: " + count); 
    }
}