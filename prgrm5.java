import java.util.Arrays;
public class prgrm5 {

    public static void main(String[] args) {
        String[] lang = {"Nodejs", "Django", "Vue", "Express", "Spring", "Flask", "Angular", "React", "Hibernate"};
        int rotation = 4;

        rotateArray(lang, rotation);
    }
    public static void rotateArray(String[] lang, int rotation) {
        String[] anticlock = new String[lang.length];
        String[] clock = new String[lang.length];

        for (int i = 0; i < lang.length; i++) {
            anticlock[i] = lang[(i + rotation) % lang.length];
        }

        for (int i = 0; i < lang.length; i++) {
            clock[i] = lang[(i - rotation + lang.length) % lang.length];
        }

        System.out.println(Arrays.toString(anticlock));

        System.out.println(Arrays.toString(clock));
    }
}
