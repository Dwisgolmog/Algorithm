package 백준.단계별로풀이.약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Num9506 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> measure = new LinkedList<>();
        int result = 0;


        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;
            for(int j=1; j<n; j++){
                if(n%j == 0){
                    result += j;
                    measure.add(j);
                }
            }

            printResult(measure, n, result);

            measure.clear();
            result = 0;
        }
    }

    public static void printResult(LinkedList<Integer> measure, int n, int result){
        if(n == result){
            System.out.print(n+" = ");
            int count = 0;
            for(int data : measure){
                count++;
                if(measure.size() == count){
                    System.out.println(data);
                }else{
                    System.out.print(data + " + ");
                }
            }
        }else{
            System.out.println(n+" is NOT perfect.");
        }
    }
}
