package 백준.단계별로풀이.정렬;

import java.io.*;
import java.util.*;

public class Num2741 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<count; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int num: list){
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}
