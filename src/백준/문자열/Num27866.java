package 문자열;

import java.lang.*;
import java.io.*;

public class Num27866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = Integer.parseInt(br.readLine());
        bw.write(str.charAt(count-1));
        bw.flush();
        bw.close();
    }
}
