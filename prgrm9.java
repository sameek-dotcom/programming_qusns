public class prgrm9 {
    public static void main(String args[])
    {
        double value=0.0;
        double[] ratings={5.9,3.9,5.9,9.0,5.6,7.9,4.5,7.9,5.6,5.6};
        int count1=0,count2;
        for(int i=0;i<ratings.length-1;i++)
        {    count2=0;
            for(int j=0;j<ratings.length;j++)
            {
                if(ratings[i]==ratings[j])
                    {
                        count2++;
                    }
            }

            if(count2>count1)
            {
                count1=count2;
                value=ratings[i];
                            
            }
            
        }
        System.out.println("most frequently appeared rating is"+value);
    }
}