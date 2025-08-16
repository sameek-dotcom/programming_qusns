public class reverse_words {
    public static void main(String[] args) {
        String str = "who, are you? iam i new";
        String[] word = str.split(" ");
        for (int i=word.length-1;i>=0;i--)
        {
            System.out.print(word[i] + " ");
        }
    }
}
