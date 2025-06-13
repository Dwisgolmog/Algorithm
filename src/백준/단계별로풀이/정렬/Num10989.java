package 백준.단계별로풀이.정렬;

import java.io.*;
import java.util.*;

public class Num10989 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] numList = new int[count];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<count; i++){
            numList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numList);

        for(int num : numList){
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}
