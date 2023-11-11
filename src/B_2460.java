// 10개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때,
// 기차에 사람이 가장 많을 때의 사람 수를 계산하는 프로그램을 작성하시오.

// 타고 내린사람 체크, 탄-내린 -> max체크
import java.util.*;
public class B_2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();

            int temp = in - out;
            max = max + temp;
            if (result < max) {
                result = max;
            }
        }
        System.out.println(result);
    }
}
