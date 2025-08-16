import java.util.Arrays;
public class prgrm2 {
    public static void main(String[] args) {
        int[] Sales = {10, 20, 15, 30, 25};
        int prefixsum[]=new int[Sales.length];
        prefixsum[0]=Sales[0];
         for(int i=1;i<Sales.length;i++)
         {
            prefixsum[i]=prefixsum[i-1]+Sales[i];
         }
         System.out.println(Arrays.toString(prefixsum));
    }
}
