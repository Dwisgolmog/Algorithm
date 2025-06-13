package 백준.단계별로풀이.약수_배수와소수;

import java.io.*;
import java.util.StringTokenizer;

public class Num5086 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numA = 1;
        int numB = 1;
        while(true){
            st = new StringTokenizer(br.readLine());
            numA = Integer.parseInt(st.nextToken());
            numB = Integer.parseInt(st.nextToken());
            if(numA == 0 && numB ==0) break;
            else if(numB % numA == 0){
                System.out.println("factor");
            }else if(numA % numB == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }

        }

    }
}
