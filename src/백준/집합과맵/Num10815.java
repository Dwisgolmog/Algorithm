package 백준.집합과맵;

import java.io.*;
import java.util.*;

public class Num10815 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, Boolean> map = new HashMap<>();

        int count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num,true);
        }

        count = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}
