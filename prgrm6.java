import java.util.Arrays;
public class prgrm6 {
    public static void main(String args[])
    {
        int risk[]={1, 0, 2, 2, 1, 1, 2, 2, 1, 0, 2, 1, 0,3};
        for(int i=0;i<risk.length;i++)
        {
            for(int j=i+1;j<risk.length;j++)
            {
                if(risk[i]>risk[j])
                {
                    int temp=risk[i];
                    risk[i]=risk[j];
                    risk[j]=temp;
                }
            }
        }
         System.out.println(Arrays.toString(risk));
    }
}
