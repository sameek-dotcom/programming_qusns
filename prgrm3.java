import java.util.Arrays;
public class prgrm3 {
    public static void main(String[] args) {
        int fuelConsumption[] = {5, 10, 3, 7, 8};
        int postfixsum[]=new int[fuelConsumption.length];
        postfixsum[fuelConsumption.length-1]=fuelConsumption[fuelConsumption.length-1]; 
        for(int i=fuelConsumption.length-2;i>=0;i--)
        {
            postfixsum[i]=postfixsum[i+1]+fuelConsumption[i];
        }  
        System.out.println(Arrays.toString(postfixsum));
    }
}
