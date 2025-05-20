package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11656 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<input.length(); i++){
            list.add(input.substring(i));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String value: list){
            sb.append(value).append("\n");
        }

        System.out.println(sb);
    }
}
