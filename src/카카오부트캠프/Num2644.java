package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2644 {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        list = new ArrayList[people+1];
        visited = new boolean[people+1];
        for(int i=1; i<=people; i++) list[i] = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int person1 = Integer.parseInt(st.nextToken());
        int person2 = Integer.parseInt(st.nextToken());

        int count = Integer.parseInt(br.readLine());
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            list[num1].add(num2);
            list[num2].add(num1);
        }

        int result = dfs(person1,person2,0);
        System.out.println(result);
    }

    public static int dfs(int person1,int person2,int count){
        visited[person1] = true;
        if(person1 == person2) return count;

        for(int i=0; i<list[person1].size(); i++){
            if(!visited[list[person1].get(i)]){
                int result = dfs(list[person1].get(i),person2,count + 1);
                if(result != -1) return result;
            }
        }

        return -1;
    }
}
