package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num1120 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        int result = Integer.MAX_VALUE;
        for(int i=0; i<=B.length-A.length; i++){
            int count = 0;
            for(int j=0; j<A.length; j++){
                if(A[j] != B[j+i]) count++;
            }

            result = Math.min(result,count);
        }

        System.out.println(result);
    }
}
