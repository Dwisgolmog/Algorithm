package 배열_2차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2566 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNum =-1;
        int row = 0;
        int column = 0;
        int num =0;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                num = Integer.parseInt(st.nextToken());
                if(maxNum < num){
                    maxNum = num;
                    row = j+1;
                    column = i+1;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(column + " " + row);
    }
}
