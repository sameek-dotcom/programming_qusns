public class prgrm8{
    public static void main(String args[])
    {
        int arr[]={400,230,400,650,280,900};
        int max=arr[0];
        int day=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
                day=i;
            }

        }
        System.out.println("Max profit:"+max);
        System.out.println("day of maximum profit:"+(day+1));

        
    }
}