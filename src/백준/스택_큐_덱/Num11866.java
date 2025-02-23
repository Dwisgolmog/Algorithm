package 백준.스택_큐_덱;

import java.io.*;
import java.util.*;
public class Num11866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int jump = Integer.parseInt(st.nextToken());
        List<Integer> list = new LinkedList<>();
        for(int i=1; i<=size; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int pivot = 0;
        while (!list.isEmpty()) {
            pivot = (pivot + jump - 1) % list.size();
            sb.append(list.remove(pivot));
            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
