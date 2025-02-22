package 백준.스택_큐_덱;

import java.io.*;
import java.util.*;
public class Num18258 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st;

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            int inputNum = 0;
            Integer num = 0;
            if(st.hasMoreTokens()) {
                inputNum = Integer.parseInt(st.nextToken());
            }

            if (input.equals("push")) {
                deque.add(inputNum);
            }else if(input.equals("pop")){
                num = deque.pollFirst();
                if (num == null) num = -1;
                sb.append(num).append("\n");
            } else if (input.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (input.equals("empty")) {
                boolean empty = deque.isEmpty();
                if(empty) num = 1;
                else num = 0;
                sb.append(num).append("\n");
            } else if (input.equals("front")) {
                num = deque.peekFirst();
                if(num == null) num = -1;
                sb.append(num).append("\n");
            } else if (input.equals("back")) {
                num = deque.peekLast();
                if(num == null) num = -1;
                sb.append(num).append("\n");
            }
        }

        System.out.println(sb);
    }
}
