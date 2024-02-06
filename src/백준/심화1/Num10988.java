package 심화1;

import java.io.*;

public class Num10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = bf.readLine();
        StringBuilder reverseStr = new StringBuilder();
        for(int i=inputStr.length()-1; i>=0; i--){
            reverseStr.append(inputStr.charAt(i));
        }
        if(inputStr.equals(reverseStr.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
