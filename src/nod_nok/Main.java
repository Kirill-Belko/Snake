package nod_nok;

import java.util.Scanner;

public class Main {
    public static int greatest_common_divisor(int a, int b) {
        if(a%b == 0) return b;
        if(b%a == 0) return a;

        if(a>b) return greatest_common_divisor(a%b, b);

        return greatest_common_divisor(a, b%a);

    }

    public static int least_common_multiple(int a, int b) {
        return (a*b) / greatest_common_divisor(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(least_common_multiple(a,b));
    }
}
