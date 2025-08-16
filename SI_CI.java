import java.util.Scanner;
public class SI_CI {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        int p=sc.nextInt();
        System.out.println("Enter Rate of Interest: ");
        int r=sc.nextInt();
        System.out.println("Enter Time in Years: ");
        int t=sc.nextInt();
        System.out.println("Simple Interest is:"+(p*r*t)/100);
        System.out.println("Compound Intrest is:"+(p*Math.pow(1+(r/100.0),t)-p));
        sc.close();
    }
}
