package 백준.단계별로풀이.스택_큐_덱;

import java.io.*;
import java.util.*;

public class Num4949 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        while(true){
            String input = br.readLine();
            if(input.equals(".")) break;

            String[] inputList = input.split("");

            for(String str : inputList){
                if(str.equals(")") && !stack.isEmpty()){
                    if(stack.peek().equals("(")) {
                        stack.pop();
                        continue;
                    }
                }else if(str.equals("]") && !stack.isEmpty()){
                    if(stack.peek().equals("[")) {
                        stack.pop();
                        continue;
                    }
                }

                if(str.equals("(") ||  str.equals("[") ||  str.equals(")") ||  str.equals("]")){
                    stack.push(str);
                }
            }

            if(stack.isEmpty()) {
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }


            stack.clear();
        }

        System.out.println(sb);
    }
}
