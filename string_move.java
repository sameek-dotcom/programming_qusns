public class string_move {
    public static void main(String args[]) {
        String s = "00100";
        int d = 2;
        int count = 0;
        for (int i = 0; i <= s.length() - d; i++) {
            String sub = s.substring(i, i + d);
            if (!sub.contains("1")) {
                count++;
            }
        }
        System.out.println(" The count of characters of the string need to be changed: " + count);
    }
}
