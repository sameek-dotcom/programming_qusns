public class ideal_arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]%arr[i]==0)
                {
                    count++;
                System.out.println("the pair which is ideal are:("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println("Count of ideal pairs: " + count);
    }
}
