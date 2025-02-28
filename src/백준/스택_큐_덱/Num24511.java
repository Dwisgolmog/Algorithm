package 백준.스택_큐_덱;

import java.io.*;
import java.util.*;
public class Num24511 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        int[] queueStack = new int[count];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            queueStack[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            if(queueStack[i] == 0) deque.addFirst(num);
        }

        count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            deque.addLast(num);

            sb.append(deque.pollFirst()).append(" ");
        }

        System.out.println(sb);
    }
}
