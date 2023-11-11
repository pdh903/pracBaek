//N개의 수와 N-1개의 연산자가 주어졌을 때,
// 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.

import java.util.*;
public class B_14888 {
    public static int max = -1000000000;
    public static int min = 1000000000;
    public static int n;
    public static int[] arrNum;
    public static int[] arrSign = new int[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arrNum = new int[n];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = sc.nextInt();
        }

        arrSign = new int[4];
        for (int i = 0; i < 4; i++) {
            arrSign[i] = sc.nextInt();
        }

        dfs14888(arrNum[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs14888(int num, int idx) { // idx : 단계
        if (idx == n) {
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (arrSign[i] > 0) {
                arrSign[i]--;

                switch (i) {
                    case 0 : dfs14888(num+arrNum[idx], idx+1); break;
                    case 1 : dfs14888(num-arrNum[idx], idx+1); break;
                    case 2 : dfs14888(num*arrNum[idx], idx+1); break;
                    case 3 : dfs14888(num/arrNum[idx], idx+1); break;
                }
                arrSign[i]++;
            }
        }
    }
}
