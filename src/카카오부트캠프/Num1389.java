package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1389 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] list = new ArrayList[N + 1];

        for(int i=0; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list[A].add(B);
            list[B].add(A);
        }

        int[] sum = new int[N+1];
        int[] move;
        boolean[] visited;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i == j) continue;

                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);

                move = new int[N+1];
                visited = new boolean[N+1];
                while(!q.isEmpty()){
                    int num = q.poll();
                    visited[num] = true;

                    if(j == num) {
                        break;
                    }
                    for(int c=0; c<list[num].size(); c++){
                        int next = list[num].get(c);
                        if(!visited[next]){
                            move[next] = move[num] + 1;
                            q.add(next);
                            visited[next] = true;
                        }

                    }
                }
                sum[i] += move[j];
            }
        }

        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i=1; i<=N; i++){
            if(min > sum[i]){
                min = sum[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}
