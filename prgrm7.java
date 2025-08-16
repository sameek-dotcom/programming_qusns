// public class prgrm7 {
//     public static void main(String[] args) {
//         {
//             int arr[]={5,4,7,1,9,1,10};
//             int min=arr[0];
//             for(int i=0;i<arr.length;i++)
//             {
//                 if(arr[i]<min)
//                 {
//                     min=arr[i];
//                 }
//             }
//             System.out.println("Minimum value in the array is: " + min);
//         }
//     }
// }

import java.util.Arrays;
public class prgrm7 {
    public static void main(String args[])
    {
        int arr[]={5,4,7,1,9,1,10};
        {
            int min=Arrays.stream(arr).min().getAsInt();
            System.out.println("Minimum value in the array is: " + min);
        }
    }
}