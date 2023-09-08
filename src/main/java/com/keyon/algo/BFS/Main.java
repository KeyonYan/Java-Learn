import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static char[][] graph;
    static int[][] dirs = new int[][] {{0,1},{1,0},{-1,0},{0,-1}};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sx = in.nextInt() - 1;
        int sy = in.nextInt() - 1;
        int ex = in.nextInt() - 1;
        int ey = in.nextInt() - 1;
        graph = new char[n][m];
        for (int i = 0; i < n; i++) {
            graph[i] = in.next().toCharArray();
        }
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {sx, sy});
        graph[sx][sy] = '*';
        int res = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] p = q.poll();
                for (int[] dir : dirs) {
                    int nx = p[0] + dir[0];
                    int ny = p[1] + dir[1];
                    if (inBoard(nx, ny, n, m) && graph[nx][ny] == '.') {
                        if (nx == ex && ny == ey) {
                            System.out.println(res+1);
                            return;
                        }
                        graph[nx][ny] = '*';
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
            res++;
        }
        System.out.println(-1);
    }
    public static boolean inBoard(int x, int y, int n, int m) {
        if (x < 0 || x >= n || y < 0 || y >= m) return false;
        return true;
    }
}