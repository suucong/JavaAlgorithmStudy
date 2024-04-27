package Section7_12;

import java.util.Scanner;


public class Section7_12_Ver1 {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public int DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Section7_12_Ver1 t = new Section7_12_Ver1();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        t.DFS(1);
        System.out.println(answer);
    }
}
