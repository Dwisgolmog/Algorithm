package 백준.동적계획법1;

import java.io.*;

public class Num24416 {
    static int fiboResult = 0;
    static int dpResult = 0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        fibo(num);
        dp(num);

        System.out.println(fiboResult + " " + dpResult);
    }

    public static int fibo(int num){
        if(num == 1 || num == 2) {
            fiboResult++;
            return 1;
        }
        return fibo(num-1) + fibo(num -2);
    }

    public static int dp(int num){
        int[] list = new int[num + 1];
        list[1] = list[2] = 1;

        for(int i=3; i<=num; i++){
            dpResult++;
            list[i] = list[i-1] + list[i-2];
        }
        return list[num];
    }
}
