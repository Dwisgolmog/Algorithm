package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num9095 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] result = new int[count];
        int max = 0;

        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(1);
        dp.add(2);
        dp.add(4);

        for(int i=0; i<count; i++){
            result[i] = Integer.parseInt(br.readLine());
            if(result[i] > max) max = result[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=3; i<max; i++){
            dp.add(dp.get(i-3) + dp.get(i-2) + dp.get(i-1));
        }

        for(int i=0; i<count; i++){
            sb.append(dp.get(result[i]-1)).append("\n");
        }

        System.out.println(sb);

    }
}
