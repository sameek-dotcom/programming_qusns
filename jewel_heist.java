import java.util.*;

public class jewel_heist {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int t = Integer.parseInt(sc.nextLine());

        for (int test = 0; test < t; test++) {
            String str = sc.nextLine();
            int score = 0;
            Stack<Character> st = new Stack<>();

            for (char ch : str.toCharArray()) {
                if (!st.isEmpty() && st.peek() == ch) {
                    st.pop();                    
                    score++;
                } else {
                    st.push(ch);
                }
            }

            System.out.println(score);
        }
        sc.close();
    }
}
