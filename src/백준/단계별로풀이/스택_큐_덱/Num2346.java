package 백준.단계별로풀이.스택_큐_덱;

import java.io.*;
import java.util.*;

public class Num2346 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();

        int[] values = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            values[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int value = values[0];
        for(int i=1; i<count; i++){
            deque.add(new int[] {i+1,values[i]});
        }

        while(!deque.isEmpty()){
            if(value > 0){
                for(int i=1; i<value; i++){
                    deque.add(deque.pollFirst());
                }
                int[] num = deque.pollFirst();
                sb.append(num[0]).append(" ");
                value = num[1];
            }else{
                for(int i=1; i<-value; i++){
                    deque.addFirst(deque.pollLast());
                }
                int[] num = deque.pollLast();
                sb.append(num[0]).append(" ");
                value = num[1];
            }
        }

        System.out.println(sb);
    }
}
