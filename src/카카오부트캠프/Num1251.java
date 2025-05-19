package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1251 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<String> list = new ArrayList<>();

        for(int i=1; i<input.length()-1; i++){
            for(int j=i+1; j<input.length(); j++){
                StringBuilder strSb1 = new StringBuilder(input.substring(0, i));
                StringBuilder strSb2 = new StringBuilder(input.substring(i, j));
                StringBuilder strSb3 = new StringBuilder(input.substring(j));
                String str1 = strSb1.reverse().toString();
                String str2 = strSb2.reverse().toString();
                String str3 = strSb3.reverse().toString();
                list.add(str1+str2+str3);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
