package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num10845 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if (input.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                deque.add(num);
            } else if (input.equals("pop")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.pollFirst()).append("\n");
            } else if (input.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (input.equals("empty")) {
                if(deque.isEmpty()) sb.append(1);
                else sb.append(0);

                sb.append("\n");
            } else if (input.equals("front")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.getFirst()).append("\n");
            } else if (input.equals("back")) {
                if(deque.isEmpty()) sb.append(-1).append("\n");
                else sb.append(deque.getLast()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
