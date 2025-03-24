package 카카오부트캠프;

import java.io.*;
import java.util.*;
public class Num1764 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        int result = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<M; i++){
            String input = br.readLine();

            if(set.contains(input)){
                result++;
                list.add(input);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String str: list){
            sb.append(str).append("\n");
        }

        System.out.println(result);
        System.out.println(sb);

    }
}
