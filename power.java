import java.util.Scanner;

public class power {
    static int p = 1;

    static int powerof(int x, int y) {
        if (y == 0) {
            return p;
        }
        p *= x;
        return powerof(x, y - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(powerof(x, y));
    }

}