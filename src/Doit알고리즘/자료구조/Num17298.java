package Doit알고리즘.자료구조;

import java.io.*;
import java.util.*;

public class Num17298 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());
        int sequence[] = new int[size];
        int result[] = new int[size];
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size; i++){
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<size; i++){
            while(!stack.isEmpty() && (sequence[stack.peek()] < sequence[i])){
                result[stack.pop()] = sequence[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < size; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
