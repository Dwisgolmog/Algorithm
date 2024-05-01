package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제 속도:84ms 코드길이:782B
public class Num1546 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] inputNum = new double[count];
        double maxNum =0;
        double result = 0;

        for(int i=0; i<count; i++){
            inputNum[i] = Integer.parseInt(st.nextToken());
            if(maxNum< inputNum[i]){
                maxNum = inputNum[i];
            }
        }

        for(int i=0; i<count; i++){
            result += (inputNum[i]/maxNum * 100);
        }

        System.out.println(result/count);

    }
}
