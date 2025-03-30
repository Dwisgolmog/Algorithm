package 카카오부트캠프;

import java.io.*;

public class Num15829 {
    static final int MOD = 1234567891;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] input = br.readLine().toCharArray();

        long result = 0L;
        long power = 1L;
        for(int i=0; i<input.length; i++){
            result += (input[i]-96) * power;
            result %= MOD;
            power = (power * 31) % MOD;
        }

        System.out.println(result);
    }
}
