package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num5430 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<count; i++){
            char[] AC = br.readLine().toCharArray();
            int length = Integer.parseInt(br.readLine());

            String input = br.readLine();
            String[] arr = input.substring(1,input.length()-1).split(",");

            Deque<Integer> result = new ArrayDeque<>();
            for(int j=0; j<length; j++){
                result.add(Integer.parseInt(arr[j]));
            }

            StringBuilder sb2 = new StringBuilder();
            boolean reverse = false;
            for (char next : AC) {
                if (next == 'R') {
                    reverse = !reverse;
                } else {
                    if (!result.isEmpty()) {
                        if(!reverse){
                            result.pollFirst();
                        }else{
                            result.pollLast();
                        }
                    } else {
                        sb2.append("error");
                        break;
                    }
                }
            }

            if(sb2.length() == 0){
                sb2.append("[");

                while(!result.isEmpty()){
                    sb2.append(reverse ? result.pollLast() : result.poll());
                    if(!result.isEmpty()) sb2.append(",");
                }

                sb2.append("]");
            }

            sb1.append(sb2.toString()).append("\n");
        }

        System.out.println(sb1);
    }
}
