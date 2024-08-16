package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] ary = new int[count];

        for(int i=0; i<count; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ary);

        for(int i=0; i<count; i++){
            System.out.println(ary[i]);
        }
    }
}
