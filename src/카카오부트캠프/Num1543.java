package 카카오부트캠프;

import java.io.*;

public class Num1543 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String input = br.readLine();

        int result = 0;
        int i = 0;
        while(i <= str.length() - input.length()) {
            if(str.startsWith(input, i)) {
                result++;
                i += input.length();
            } else {
                i++;
            }
        }

        System.out.println(result);
    }
}
