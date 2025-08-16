public class decimal_spike {
    public static void main(String args[])
    {
        int n=5;
        int arr[]={1,2,3,4,5};
        int spike=2;
        for(int i=0;i<n;i++){
            String binary=Integer.toBinaryString(arr[i]);
            if(spike>=binary.length())
            {
                System.out.println(0);
            }
            else{
            String remaining=binary.substring(0,binary.length()-spike);
            int result=Integer.parseInt(remaining,2);
            System.out.println(result);
            }
        }
        
    }
}