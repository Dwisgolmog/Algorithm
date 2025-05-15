package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2910 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        st.nextToken();
        List<Integer> list = new ArrayList<>();
        List<Integer> original = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
            original.add(num);
            map.put(num,map.getOrDefault(num,0)+1);
        }

        list.sort((c1, c2) -> {
            if (!map.get(c1).equals(map.get(c2))) return Integer.compare(map.get(c2), map.get(c1));
            else return original.indexOf(c1) - original.indexOf(c2);
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
