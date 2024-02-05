package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10818 {
    public static void main(String arg[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = Integer.parseInt(bf.readLine());
        String num = bf.readLine();

        st = new StringTokenizer(num);

        int maxNum = Integer.parseInt(st.nextToken());
        int minNum = maxNum;
        int buffer =0;

        for(int i = 1; i<count; i++){
            buffer = Integer.parseInt(st.nextToken());
            if(minNum > buffer){
                minNum = buffer;
            }else if(maxNum < buffer){
                maxNum = buffer;
            }
        }

        System.out.println(minNum + " " + maxNum);

    }
}
