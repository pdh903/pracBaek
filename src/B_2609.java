//두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

// 최대 공약수 : 유클리드
// 최소 공배수 : 두수의 곱/최대 공약수
import java.util.*;

public class B_2609 {
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b) + "\n" + a*b/gcd(a,b));
    }
}
