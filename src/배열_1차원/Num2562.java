package 배열_1차원;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num2562 {
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[9];
        int maxNumber =0;
        int index =0;

        for(int i=0; i<9; i++){
            numbers[i] = sc.nextInt();
            if(maxNumber < numbers[i]){
                maxNumber = numbers[i];
                index = i+1;
            }
        }

        bw.write(maxNumber+"\n"+index);
        bw.flush();
        bw.close();

    }
}
