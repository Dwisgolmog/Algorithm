package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num5597 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] attendance  = new int[31];
        Arrays.fill(attendance,-1);
        int number = 0;


        for(int i=1; i<29; i++){
            number = Integer.parseInt(br.readLine());
            attendance[number] = 1;
        }

        for(int i=1; i<attendance.length; i++){
            if(attendance[i] == -1)
                System.out.println(i);
        }

    }
}
