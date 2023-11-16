package 문자열;

import java.io.*;

public class Num9086 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String str;

        for(int i=0; i<count; i++){
            str = br.readLine();
            bw.write(str.substring(0,1));
            bw.write(str.substring(str.length()-1,str.length()));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
