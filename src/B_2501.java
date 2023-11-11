import java.util.*;

public class B_2501 {
    static void devisor(int p, ArrayList<Integer> al) {
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                al.add(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int k = sc.nextInt();
        devisor(n, al);
        if (al.isEmpty() || al.size() < k) {
            System.out.println(0);
        } else System.out.println(al.get(k-1));


    }

}
