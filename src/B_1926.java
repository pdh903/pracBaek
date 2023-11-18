import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1926 {

    static int n,m;
    static int[][] map;
    static boolean[][] check;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList();
        q.add(new int[]{x, y});
        int size=1;

        while (!q.isEmpty()) {
            int[] p = q.poll();
            int px = p[0];
            int py = p[1];

            for (int d = 0; d < 4; d++) {
                int nx = px + dx[d];
                int ny = py + dy[d];
                if (nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1) {
                    continue;
                }
                if (check[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == 1) {
                    size++;
                    check[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        check = new boolean[n][m];

        int count = 0;
        int max = 0;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (map[x][y] == 1 & check[x][y] == false) {
                    check[x][y] = true;
                    count++;
                    max = Math.max(max, bfs(x, y));
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}
