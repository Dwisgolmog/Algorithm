package 배열_1차원;

import java.lang.*;
import java.io.*;
public class Num2743 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = br.readLine().length();
        bw.write(String.valueOf(length));
        bw.flush();
        bw.close();
    }
}