// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

import java.util.*;
public class B_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for (int j = 2; j <= arr[i]; j++) {
                if (j == arr[i]) {
                    count++;
                } else if (arr[i] % j == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
