package 백준.solvedac.class3;

import java.io.*;
import java.util.*;

public class Num11723 {
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if(input.equals("all")){
                saveAll();
            }else if(input.equals("empty")){
                set = new HashSet<>();
            }else{
                int num = Integer.parseInt(st.nextToken());

                if(input.equals("add")){
                    if(set.contains(num)) continue;
                    set.add(num);
                }else if(input.equals("remove")){
                    set.remove(num);
                }else if(input.equals("check")){
                    if(set.contains(num)) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                }else if(input.equals("toggle")){
                    if(set.contains(num)) set.remove(num);
                    else set.add(num);
                }
            }
        }

        System.out.println(sb);
    }

    public static void saveAll(){
        set = new HashSet<>();
        for(int i=1; i<=20; i++){
            set.add(i);
        }
    }
}
