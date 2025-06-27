package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num30648 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(br.readLine());
        int[][] map = new int[R][R];

        int count = 0;
        while(true){
            map[a][b] = map[a][b] + 1;
            if(map[a][b] > 1) break;

            if(a+b+2 < R){
                a += 1;
                b += 1;
            }else{
                a /= 2;
                b /= 2;
            }
            count++;
        }

        System.out.println(count);
    }
}
