import java.util.*;
public class num_guess {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int target=rand.nextInt(100) + 1;
        int tries=5;
        for(int i=0;i<tries;i++)
        {
            System.out.println("Enter your guess between 1 to 100 ");
            int guess=sc.nextInt();
            if(guess<target)
            {
                System.out.println("Too Low\n");
            }
            else if(guess>target)
            {
                System.out.println("Too High\n");
            }
            else if(guess==target)
            {
                System.out.println("You guessed it right!");
                break;
            }
        }
                System.out.println("You lost!");
                 System.out.println("Sorry, the number was " + target);
                sc.close();
            }
}