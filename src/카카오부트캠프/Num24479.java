package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num24479 {

    static int vertex,edge,startPoint;
    static boolean[] visited;
    static int[] order;
    static int count = 1;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<List<Integer>> list = new ArrayList<>();

        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        startPoint = Integer.parseInt(st.nextToken());
        visited = new boolean[vertex+1];
        order = new int[vertex+1];

        list.add(0, new ArrayList<>());
        for(int i=1; i<=vertex; i++){
            list.add(i, new ArrayList<>());
        }

        for(int i=0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            list.get(num1).add(num2);
            list.get(num2).add(num1);
        }

        for(int i=1; i<vertex; i++){
            Collections.sort(list.get(i));
        }

        dfs(list,startPoint);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=vertex; i++){
            sb.append(order[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(List<List<Integer>> list,int num){
        visited[num] = true;
        order[num] = count++;

        for(int x : list.get(num)){
            if(!visited[x]) dfs(list,x);
        }

    }
}
