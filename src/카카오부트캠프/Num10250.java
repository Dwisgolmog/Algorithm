package 카카오부트캠프;

import java.io.*;
import java.util.*;
public class Num10250 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());

            int room = 0;
            if(people%h == 0) room = people/h;
            else room = people/h + 1;
            int floor = people%h;

            if(floor == 0) sb.append(h);
            else sb.append(floor);
            if(room < 10) sb.append(0).append(room).append("\n");
            else sb.append(room).append("\n");
        }

        System.out.println(sb);
    }
}
