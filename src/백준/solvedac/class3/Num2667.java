package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num2667 {

    static int[][] map;
    static boolean[][] visited;
    static int[] moveX = {-1, 1, 0, 0};
    static int[] moveY = {0, 0, -1, 1};
    static ArrayList<Integer> list = new ArrayList<>();
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        map = new int[size][size];
        visited = new boolean[size][size];

        for(int i = 0; i < size; i++) {
            String line = br.readLine();
            for(int j = 0; j < size; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    int num = bfs(i, j);
                    list.add(num);
                }
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }

    public static int bfs(int x, int y) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        int count = 1;

        while (!q.isEmpty()) {
            int[] num = q.poll();

            for(int i = 0; i < 4; i++) {
                int nextX = num[0] + moveX[i];
                int nextY = num[1] + moveY[i];

                if(nextX >= 0 && nextX < size && nextY >= 0 && nextY < size
                        && map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    q.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    count++;
                }
            }
        }

        return count;
    }
}