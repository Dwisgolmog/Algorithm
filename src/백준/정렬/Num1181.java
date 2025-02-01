package 백준.정렬;

import java.io.*;
import java.util.*;

public class Num1181 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<count; i++){
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list,(a,b) ->{
            if(a.length() == b.length()) return a.compareTo(b);
            return Integer.compare(a.length(),b.length());
        });

        for(String word : list){
            sb.append(word).append("\n");
        }

        System.out.println(sb);

    }
}
