//일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
//
//아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.


import java.util.*;

public class B_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> short9 = new ArrayList<Integer>();
        int max = 0;
        for (int i = 0; i < 9; i++) {
            short9.add(sc.nextInt());
            max = max + short9.get(i);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (max - (short9.get(i) + short9.get(j)) == 100) {
                    short9.remove(j);
                    short9.remove(i);
                    break;
                }
            }
            if (short9.size() == 7) {
                break;
            }
        }
        short9.sort(Comparator.naturalOrder());

        for (int i : short9) {
            System.out.print(i + " ");
        }

    }
}
