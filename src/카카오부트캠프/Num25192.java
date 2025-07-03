package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num25192 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        int result = 0;
        for(int i=0; i<count; i++){
            String str = br.readLine();

            if(str.equals("ENTER")) {
                result += set.size();
                set = new HashSet<>();
                continue;
            }
            set.add(str);
        }

        System.out.println(result + set.size());
    }
}
