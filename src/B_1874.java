import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class B_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        ArrayList<Character> al = new ArrayList<>();
        int[] num = new int[n+1];
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int chk = 1;
        int idx = 1;
        boolean result = true;
        while (true) {
            if (stack.isEmpty() && idx == num.length) {
                break;
            }
            if (!stack.isEmpty() && stack.peek() > num[idx]) {
                result = false;
                break;
            }
            if (chk <= num[idx]) {
                stack.push(chk);
                al.add('+');
                chk++;
            } else if (chk > num[idx]) {
                stack.pop();
                al.add('-');
                idx++;
            }

        }
        if (result == false) {
            System.out.println("NO");
        } else {
            for (char i :
                    al) {
                System.out.println(i + " ");
            }

        }
    }
}
