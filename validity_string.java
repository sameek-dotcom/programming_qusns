public class validity_string {
    public static boolean isValid(String s)
    {
        while(s.contains("abc"))
            s=s.replace("abc","");
            return s.equals("") ? true:false;
        }
        public static void main(String[] args) {
            {
                String s="aabcbc";
                System.out.println(isValid(s));

            }
        }
    }

