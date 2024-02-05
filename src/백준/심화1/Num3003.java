package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num3003 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int chess[] = {1,1,2,2,2,8};
        String result = "";

        for(int i=0; i<chess.length; i++){
            result += chess[i] - Integer.parseInt(st.nextToken());
            result += " ";
        }
        System.out.println(result);
    }
}
