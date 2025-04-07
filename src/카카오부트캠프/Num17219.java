package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num17219 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pwdCount = Integer.parseInt(st.nextToken());
        int inputCount = Integer.parseInt(st.nextToken());

        HashMap<String,String> map = new HashMap<>();

        for(int i=0; i<pwdCount; i++){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<inputCount; i++){
            sb.append(map.get(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}
