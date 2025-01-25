package 백준.정렬;

import java.io.*;
import java.util.*;

public class Num1427 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int[] numList = input.chars().map(c -> c - '0').boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for(int num : numList){
            sb.append(num);
        }

        System.out.println(sb);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb;
//        char[] input = br.readLine().toCharArray();
//        Arrays.sort(input);
//
//        sb = new StringBuilder(new String(input)).reverse();
//
//        System.out.println(sb);
    }
}
