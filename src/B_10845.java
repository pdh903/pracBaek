import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int num = Integer.parseInt(command[1]);
                    queue.offer(num);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else System.out.println(0);
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else System.out.println(queue.peek());
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else System.out.println(((LinkedList<Integer>) queue).getLast());
                    break;
            }
        }
    }
}
