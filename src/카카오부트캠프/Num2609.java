package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2609 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int num3 = calc(num1,num2);

        System.out.println(num3);
        System.out.println(num1*num2/num3);
    }

    public static int calc(int num1,int num2){
        if(num2 == 0) return num1;

        return calc(num2,num1%num2);
    }
}
