package 문자열;

import java.io.*;
import java.util.*;

public class Num10809 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        String str = sc.nextLine();

        int num = 97;
        String keyValue;
        for(int i=0; i<26; i++){
            keyValue = String.valueOf((char)num++);
            map.put(keyValue,-1);
        }

        for(int i=0; i<str.length(); i++){
            keyValue = String.valueOf(str.charAt(i));
            if(map.get(keyValue) == -1){
                map.put(keyValue,i);
            }
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
    }
}
