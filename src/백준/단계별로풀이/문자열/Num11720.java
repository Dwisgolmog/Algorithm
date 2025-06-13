package 문자열;

import java.io.*;
import java.util.*;

public class Num11720 {
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str = sc.next();
        int result = 0;

        for(int i=0; i<count; i++){
            //char -> String -> int 로 변환
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println(result);
    }
}
