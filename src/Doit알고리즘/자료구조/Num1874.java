package Doit알고리즘.자료구조;

import java.io.*;
import java.util.*;

public class Num1874 {
    public static void main(String[] args) throws IOException {
        //데이터 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] sequence = new int[count];

        for(int i=0; i<count; i++){
            sequence[i] = Integer.parseInt(br.readLine());
        }


        Stack<Integer> stack = new Stack<>();
        StringBuilder sb =new StringBuilder("+\n");
        int i=2;
        int j=0;
        stack.push(1);
        while(true){

            if(j == count) break;

            if(stack.isEmpty()){
                sb.append("+\n");
                stack.push(i++);
            }

            if(stack.peek() == sequence[j]){
                sb.append("-\n");
                stack.pop();
                j++;
                continue;

            }else if((stack.peek() > sequence[j]) && i-1 == count){
                sb = new StringBuilder("NO");
                break;
            }

            sb.append("+\n");
            stack.push(i++);
        }

        System.out.println(sb);

    }
}