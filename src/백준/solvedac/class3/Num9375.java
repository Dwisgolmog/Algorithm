package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num9375 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            HashMap<String,Integer> map = new HashMap<>();
            int size = Integer.parseInt(br.readLine());
            int result = 1;

            for(int j=0; j<size; j++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String input = st.nextToken();
                map.put(input,map.getOrDefault(input,0) + 1);
            }

            for(String key: map.keySet()){
                result *= map.get(key) + 1;
            }
            sb.append(result - 1).append("\n");
        }

        System.out.println(sb);
    }
}
