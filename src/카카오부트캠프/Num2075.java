package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2075 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        StringTokenizer st;
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<count; j++){
                q.add(Integer.parseInt(st.nextToken()));
            }
        }

        Integer result = 0;
        for(int i=0; i<count; i++){
            result = q.poll();
        }

        System.out.println(result);
    }
}
