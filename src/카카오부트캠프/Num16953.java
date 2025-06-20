package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num16953 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());

        System.out.println(BFS(A,B));
    }

    public static Long BFS(Long A,Long B){
        Queue<Long[]> q = new ArrayDeque<>();
        q.add(new Long[]{A * 2, 2L});
        q.add(new Long[]{Long.parseLong(A + "1"), 2L});

        while(!q.isEmpty()){
            Long[] num = q.poll();

            if(num[0].equals(B)){
                return num[1];
            }else if(num[0] < B){
                q.add(new Long[]{num[0] * 2, num[1] + 1});
                q.add(new Long[]{Long.parseLong(num[0] + "1"), num[1] + 1});
            }
        }

        return -1L;
    }
}
