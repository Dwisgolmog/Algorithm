package 백준.단계별로풀이.스택_큐_덱;

import java.io.*;
import java.util.*;

public class Num9012 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<count; i++){
            char[] input = br.readLine().toCharArray();

            for(int j=0; j<input.length; j++){
                if(stack.isEmpty()) {
                    stack.push(input[j]);
                    continue;
                }

                if(stack.peek() == '(' && input[j] == ')'){
                    stack.pop();
                    continue;
                }

                stack.push(input[j]);
            }

            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            stack.clear();
        }

    }
}
