package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num26069 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        HashMap<String,Integer> map = new HashMap<>();
        map.put("ChongChong",1);

        StringTokenizer st;
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            String rabbit1 = st.nextToken();
            String rabbit2 = st.nextToken();

            if(!map.containsKey(rabbit1)) map.put(rabbit1,0);
            if(!map.containsKey(rabbit2)) map.put(rabbit2,0);

            if(map.get(rabbit1) == 1 || map.get(rabbit2) == 1){
                map.put(rabbit1,1);
                map.put(rabbit2,1);
            }
        }

        int result  = 0;
        for(String key : map.keySet()){
            if(map.get(key) == 1) result++;
        }
        System.out.println(result);
    }
}
