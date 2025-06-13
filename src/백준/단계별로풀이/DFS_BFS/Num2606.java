package 백준.단계별로풀이.DFS_BFS;

import java.io.*;
import java.util.*;

public class Num2606 {
    static int computerCount;
    static boolean visited[];
    static int connect[][];
    static int count;
    public static void bfs(){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visited[1] = true;
        for(int i=1; i<computerCount; i++){

            if(q.isEmpty()) continue;
            int num = q.remove();

            for(int j=1; j<computerCount; j++){
                if(connect[num][j] == 1 && !visited[j]){
                    q.add(j);
                    visited[j] = true;
                    count++;
                }
            }

        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        computerCount = Integer.parseInt(br.readLine())+1;
        int connectCount = Integer.parseInt(br.readLine());

        visited = new boolean[computerCount];
        count = 0;

        connect = new int[computerCount][computerCount];
        for(int i=0; i<connectCount; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            connect[a][b] = connect[b][a] = 1;
        }
        bfs();
        System.out.println(count);
    }
}
