package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11724 {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static int vertex,edge;
    static boolean[] visited;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        visited = new boolean[vertex+1];

        for(int i = 0; i<=vertex; i++) list.add(new ArrayList<>());

        for(int i=0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            list.get(num1).add(num2);
            list.get(num2).add(num1);
        }

        int result = 0;
        for(int i=1; i<=vertex; i++){
            if(!visited[i]){
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }

    public static void dfs(int index){
        if(visited[index]) return;

        visited[index] = true;
        for (int num : list.get(index)) {
            if(!visited[num]) dfs(num);
        }
    }
}
