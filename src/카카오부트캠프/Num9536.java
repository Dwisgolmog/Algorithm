package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num9536 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) list.add(st.nextToken());

            while(true){
                String[] input = br.readLine().split(" ");
                if (input[1].equals("does")) {
                    break;
                }else if(input[1].equals("goes")){
                    list.removeIf(s -> s.equals(input[2]));
                }
            }

            for(int j=0; j<list.size(); j++){
                sb.append(list.get(j)).append(" ");
            }

            list.clear();
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
