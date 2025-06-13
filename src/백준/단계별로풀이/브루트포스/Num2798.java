package 백준.단계별로풀이.브루트포스;

import java.io.*;
import java.util.*;

public class Num2798 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int[] card = new int[count];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<count-2; i++){
            for(int j=i+1; j<count-1; j++){
                for(int c=j+1; c<count; c++){
                    int sum = card[i]+card[j]+card[c];
                    if(sum <= limit) {
                        if(sum > result) result = sum;
                    }
                }
            }
        }

        System.out.println(result); 
    }
}
