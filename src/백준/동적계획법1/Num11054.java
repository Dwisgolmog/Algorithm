package 백준.동적계획법1;

import java.io.*;
import java.util.*;
public class Num11054 {
    static int[] list;
    static int[] LIS;
    static int[] LDS;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        list = new int[count];
        LIS = new int[count];
        LDS = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for(int i=0; i<count; i++){
            result = Math.max(LIS(i) + LDS(i), result);
        }

        System.out.println(result-1);
    }

    public static int LIS(int N){

        if(LIS[N] == 0){
            LIS[N] = 1;

            for(int i=N-1; i>=0; i--){
                if(list[i] < list[N]){
                    LIS[N] = Math.max(LIS[N],LIS(i) + 1);
                }
            }
        }

        return LIS[N];
    }

    public static int LDS(int N){
        if(LDS[N] == 0){
            LDS[N] = 1;

            for(int i=N+1; i<LDS.length; i++){
                if(list[i] < list[N]){
                    LDS[N] = Math.max(LDS[N],LDS(i) + 1);
                }
            }
        }

        return LDS[N];
    }

}
