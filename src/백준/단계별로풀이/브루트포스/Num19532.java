package 백준.단계별로풀이.브루트포스;

import java.io.*;
import java.util.*;

public class Num19532 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[6];

        for(int i=0; i<6; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        int a = list[0], b = list[1], c = list[2],d = list[3], e = list[4], f = list[5];

        for(int x = -999; x<=999; x++){
            for(int y = -999; y<=999; y++){
                if (a * x + b * y == c && d * x + e * y == f) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }

}
