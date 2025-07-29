package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1735 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());

        int lcm = LCM(B1,B2);
        int num = (lcm/B1)*A1 + (lcm/B2)*A2;
        int gcd = GCD(lcm,num);
        System.out.println(num/gcd+" "+lcm/gcd);
    }

    public static int GCD(int B1,int B2){
        while(B2 != 0){
            int temp = B2;
            B2 = B1 % B2;
            B1 = temp;
        }

        return B1;
    }

    public static int LCM(int B1,int B2){
        return B1 * B2 / GCD(B1,B2);
    }
}
