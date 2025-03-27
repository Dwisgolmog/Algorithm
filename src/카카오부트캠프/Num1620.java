package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1620 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int docLength = Integer.parseInt(st.nextToken());
        int inputLength = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> strMap = new HashMap<>();
        HashMap<Integer,String> intMap = new HashMap<>();

        for(int i=0; i<docLength; i++){
            String input = br.readLine();
            strMap.put(input,i+1);
            intMap.put(i+1,input);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<inputLength; i++){
            String input = br.readLine();
            if(input.charAt(0) < 'A'){
                sb.append(intMap.get(Integer.parseInt(input))).append("\n");
            }else{
                sb.append(strMap.get(input)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
