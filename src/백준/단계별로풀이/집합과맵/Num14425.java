package 백준.단계별로풀이.집합과맵;

import java.io.*;
import java.util.*;

public class Num14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        for(int i=0; i<M; i++){
            if (set.contains(br.readLine())) {
                result++;
            }
        }

        System.out.println(result);
    }
}
