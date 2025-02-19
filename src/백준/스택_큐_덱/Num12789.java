package 백준.스택_큐_덱;

import java.io.*;
import java.util.*;

public class Num12789 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for(int i=0; i<count; i++){
            while (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            }
            int nextNum = Integer.parseInt(st.nextToken());
            if(num == nextNum) {
                num++;
            }else{
                stack.push(nextNum);
            }
        }

        while(!stack.isEmpty() && stack.peek() == num){
            stack.pop();
            num++;
        }

        if(num == count+1) {
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }

    }
}


