package 백준.단계별로풀이.스택_큐_덱;

import java.io.*;
import java.util.*;
public class Num28279 {

    static Deque<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void dequeCommand(int input,int inputNum){
        Integer num = -1;
        if(input == 1){
            deque.addFirst(inputNum);
        }else if(input == 2){
            deque.addLast(inputNum);
        }else if(input == 3){
            num = deque.pollFirst();
            if(num == null) num = -1;
            sb.append(num).append("\n");
        }else if(input == 4){
            num = deque.pollLast();
            if(num == null) num = -1;
            sb.append(num).append("\n");
        }else if(input == 5){
            sb.append(deque.size()).append("\n");
        }else if(input == 6){
            boolean empty = deque.isEmpty();
            if(empty) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }else if(input == 7){
            num = deque.peekFirst();
            if(num == null) num = -1;
            sb.append(num).append("\n");
        }else if(input == 8){
            num = deque.peekLast();
            if(num == null) num = -1;
            sb.append(num).append("\n");
        }
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int inputNum = -1;
            if(st.hasMoreTokens()){
                inputNum = Integer.parseInt(st.nextToken());
            }

            dequeCommand(input,inputNum);
        }

        System.out.println(sb);
    }
}
