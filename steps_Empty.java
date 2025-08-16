import java.util.*;

public class steps_Empty {
    public static int empty_arrray(int arr[])
    {
        int count=0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i:arr){
        list.add(i);
        }
        while(!list.isEmpty())
        {
            int min= Collections.min(list);
            int first=list.peekFirst();
            if(first==min)
            {
                list.removeFirst();
            }
            else
            {
                list.pollFirst();
                list.addLast(first);
        }
        
        count++;
    }
    return count;
}
    public static void main(String[] args) {
       int arr[]={3,4,-1};
       System.out.println(empty_arrray(arr));
    }
}
