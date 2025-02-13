package 백준.스택_큐_덱;

import java.io.*;
import java.util.*;

public class Num28278 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            if(number == 1){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(number == 2){
                int output = !stack.isEmpty() ? stack.pop() : -1;
                sb.append(output).append("\n");
            }else if(number == 3){
                sb.append(stack.size()).append("\n");
            }else if(number == 4){
                int output = stack.isEmpty() ? 1 : 0;
                sb.append(output).append("\n");
            }else if(number == 5){
                int output = !stack.isEmpty() ? stack.peek() : -1;
                sb.append(output).append("\n");
            }
        }

        System.out.println(sb);
    }
}
