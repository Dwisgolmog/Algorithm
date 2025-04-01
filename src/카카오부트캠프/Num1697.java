package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1697 {

    static Queue<int[]> queue = new LinkedList<>();
    static int[] visite = new int[100001];
    static int brother;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int subin = Integer.parseInt(st.nextToken());
        brother = Integer.parseInt(st.nextToken());
        System.out.println(dfs(subin));
    }

    public static int dfs(int subin){
        queue.add(new int[]{subin, 0});
        visite[subin] = 1;

        while(!queue.isEmpty()){
            int[] num = queue.remove();

            if(num[0] == brother) return num[1];

            int[] nextSpot = new int[] {num[0]+1,num[0]-1,num[0]*2};
            for(int next: nextSpot){
                if(next < 0 || next > 100000 || visite[next] == 1) continue;

                queue.add(new int[]{next, num[1] + 1});
                visite[next] = 1;
            }
        }

        return -1;
    }
}
