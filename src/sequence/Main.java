package sequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(count == n) break;
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
