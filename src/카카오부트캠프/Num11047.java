package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num11047 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<count; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Collections.reverseOrder());

        int result = 0;
        for(int i=0; i<count; i++){
            if(list.get(i) <= price){
                result += price/list.get(i);
                price = price%list.get(i);
            }

//            while(list.get(i) <= price){
//                price -= list.get(i);
//                result++;
//            }
        }

        System.out.println(result);
    }
}
