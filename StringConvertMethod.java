import java.util.Scanner;

public class StringConvertMethod {
    public static void main(String[] args) {
        //convert java String to int
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int v = Integer.parseInt(s);
        System.out.println(v);
        //convert int to String
        int n = sc.nextInt();
        String s1 = String.valueOf(n);
        System.out.println(s1);
        // convert String to long
        String a = sc.next();
        Long l = Long.valueOf(a);
        System.out.println(l);
        // convert long to string
        long l1 = sc.nextLong();
        String s2 = String.valueOf(l1);
        System.out.println(s2);


    }
}
