package 백준.집합과맵;

import java.io.*;
import java.util.*;

public class Num7785 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st;


        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String work = st.nextToken();

            map.put(name,work);
        }

        for(String key: map.keySet()){
            if(map.get(key).equals("enter")) list.add(key);
        }

        list.sort(Collections.reverseOrder());

        for(String name: list){
            System.out.println(name);
        }

    }
}
