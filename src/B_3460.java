import java.util.*;

public class B_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] array = new int[T];

        for (int i = 0; i < T; i++) {
            array[i] = sc.nextInt();
        }
        int x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            int count = 0;
            while (x != 0) {
                if (x % 2 == 1) {
                    System.out.print(count + " ");
                }
                count++;
                x = x / 2;
            }
            System.out.println();
        }




    }
}
