package 백준.스택_큐_덱;

import java.io.*;
import java.util.*;

public class Num10773 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());

            if(!stack.isEmpty() && (num == 0)){
                stack.pop();
                continue;
            }

            stack.push(num);
        }

        int result = 0;

        while(!stack.isEmpty()){
            result += stack.pop();
        }

        System.out.println(result);
    }
}
