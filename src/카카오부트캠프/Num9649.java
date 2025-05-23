package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num9649 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        String line;
        while(true){
            line = br.readLine();
            if(line == null || line.isEmpty()) break;
            st = new StringTokenizer(line);
            int AB = Integer.parseInt(st.nextToken());
            int AC = Integer.parseInt(st.nextToken());
            int BD = Integer.parseInt(st.nextToken());

            int num1 = AB * AC;
            int num2 = BD - AC;

            int c = gcd(num1,num2);
            sb.append(num1/c).append("/").append(num2/c).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a,int b){

        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
