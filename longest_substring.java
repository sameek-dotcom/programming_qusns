import java.util.*;
public class longest_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String:");
        String s=sc.nextLine();
        HashSet<Character> hs=new HashSet<Character>();
        for(char c:s.toCharArray()) {
            hs.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : hs) {
            result.append(c);
        }
        System.out.println("The longest substring is: " + result.toString());
        sc.close();
    }
}
