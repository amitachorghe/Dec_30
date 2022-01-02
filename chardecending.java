
import java.util.Scanner;

public class chardecending {

    public static void main(String[] args) {
        System.out.print("Enter Character : ");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int a[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i) - 'a';
            a[ind]++;
        }
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }

    }

}