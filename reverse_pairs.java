class reverse_pairs
 {
    public int reversePairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                long mul=2L*nums[j];
                if(nums[i]>mul)
                {
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        reverse_pairs r = new reverse_pairs();
        int result=r.reversePairs(nums);
        System.out.println("The no of reverse pairs are: "+result);
    }
}