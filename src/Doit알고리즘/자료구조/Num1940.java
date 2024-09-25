package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1940 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ingredientCount = Integer.parseInt(br.readLine());//재료의 갯수
        int armor = Integer.parseInt(br.readLine());//갑옷이 완성되는 번호의 합
        int ingredient[] = new int[ingredientCount];//재료들

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<ingredientCount; i++){
            ingredient[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ingredient);

        int start_point = 0;
        int end_point = ingredientCount-1;
        int sum = 0;
        int count = 0;

        while(start_point < end_point){
            sum = ingredient[start_point] + ingredient[end_point];
            if(sum > armor){
                end_point--;
            }else if(sum < armor){
                start_point++;
            } else {
                count++;
                end_point--;
            }
        }

        System.out.println(count);

    }
}
