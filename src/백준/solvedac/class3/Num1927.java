package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num1927 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(q.isEmpty()) sb.append(0).append("\n");
                else sb.append(q.remove()).append("\n");
            }else{
                q.add(input);
            }
        }

        System.out.println(sb);

    }
}
