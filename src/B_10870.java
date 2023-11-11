//n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class B_10870 {

    public static int Fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else return Fibo(n - 2) + Fibo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }
}
