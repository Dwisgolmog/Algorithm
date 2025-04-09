package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1654 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<count; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        long left = 1;
        long right = list.get(count-1);
        long result = 0;

        while(left <= right){
            long mid = (left+right) /2;
            long countresult = 0;

            for(int i=0; i<count; i++){
                countresult += list.get(i)/mid;
            }

            if(countresult >= size){
                result = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
