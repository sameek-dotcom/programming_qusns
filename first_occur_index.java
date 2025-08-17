class first_occur_index {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String args[])
    {
        first_occur_index f=new first_occur_index();
        System.out.println(f.strStr("hello","llw"));
    }
}