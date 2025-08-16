import java.util.Arrays;

public class triplet {
    public static void main(String args[]) {
        int arr[] = { -3, -5, 4, 13, 12 };
        int a[] = new int[arr.length];
        for (int l = 0; l < arr.length; l++) {
            a[l] = arr[l] * arr[l];
        }
         Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (a[i] + a[j] == a[k]) {
                        count++;
                        int b=(int)Math.sqrt(a[i]);
                        int c=(int)Math.sqrt(a[j]);
                        int d=(int)Math.sqrt(a[k]);
                        System.out.println("Triplets found: " + b + "," +c+ "," + d);

                    }
                }
            }

        }
        if(count==0){
            System.out.println("No triplets found");
    }
        }

    }
