// 배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
//
//배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.

import java.util.*;

public class B_2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            result[i] = arr[7];
        }

        for (int i :
                result) {
            System.out.println(i);
        }
    }
}
