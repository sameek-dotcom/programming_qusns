import java.util.TreeSet;
class prgrm1
{
    public static void main(String[] args) 
       {
        int[] array={111, 222, 333, 4444, 666,222, 0000};
        TreeSet<Integer> hp=new TreeSet<Integer>();
        for(int num: array)
        {
            while(num>0)
            {
            int digit=num%10;
            hp.add(digit);
            num=num/10;
            }
            if(num==0)
            {
                hp.add(0);
            }
        }
            System.out.println(hp);
       }
}