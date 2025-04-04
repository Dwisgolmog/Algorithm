package 카카오부트캠프;

import java.io.*;

public class Num2839 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int result = 0;
        while(true){
            if(count < 0) {
                result = -1;
                break;
            }else if(count%5 == 0){
                result += count/5;
                break;
            }else{
                count -= 3;
                result++;
            }
        }

        System.out.println(result);
    }

}
