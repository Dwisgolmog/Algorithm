package 백준.약수_배수와소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num2501 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=1; i<N+1; i++){
            if(N%i == 0) map.put(map.size()+1,i);
        }

        if(map.get(K) == null) System.out.println(0);
        else System.out.println(map.get(K));

    }
}
