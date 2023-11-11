//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라
// 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

import java.util.*;
public class B_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int small = 10000;
        int count = 0;

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    sum = sum + i;
                    count++;
                    if (i < small) {
                        small = i;
                    }
                } else if (i % j == 0) {
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(small);
        }
    }
}
