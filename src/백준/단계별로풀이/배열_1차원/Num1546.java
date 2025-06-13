package 배열_1차원;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Num1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int count = Integer.parseInt(br.readLine());
        double[] score = new double[count];
        double maxNum =0;

        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<count; i++){
            score[i] = Double.parseDouble(st.nextToken());
            if(maxNum < score[i]) maxNum = score[i];
        }

        double average =0;
        
        for(int i=0; i<count; i++){
            score[i] = score[i]/maxNum*100;
            average += score[i];
        }

        System.out.println(average/count);
    }
}
