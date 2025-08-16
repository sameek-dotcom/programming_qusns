import java.util.HashSet;

public class smallest_missing {
    public static int smallestMissing(int[] nums)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(Integer num : nums) 
        {
            hs.add(num);
        }
        int i=1;
        while(true)
        {
            if(!hs.contains(i))
                return i;
            i++;
        }
    }
   public static void main(String args[])
   {
    int nums[]={0,-1,1,2,3,4,5};
    System.out.println("Smallest Missing elemnet is:"+smallestMissing(nums));
   }
}
