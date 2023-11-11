//이 문제는 다음과 같다. 1을 한 번, 2를 두 번, 3을 세 번,
// 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 ..
// 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.

// k를 k번 반복해서 더하기

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
                if (list.size() == b + 1) {
                    break;
                }
            }
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }
}
