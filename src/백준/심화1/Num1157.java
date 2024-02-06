package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Num1157 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<Character,Integer> map = new HashMap<>();
        char[] charArray = bf.readLine().toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >= 97){
                charArray[i] = (char) (charArray[i] - 32);
            }
            if(!map.containsKey(charArray[i])){
                map.put(charArray[i],1);
            }else{
                map.put(charArray[i],map.get(charArray[i])+1);
            }
        }

        String result = "";
        int temp = 0;
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(temp == m.getValue()){
                 result = "?";
            }else if(temp < m.getValue()){
                temp = m.getValue();
                result = m.getKey().toString();
            }
        }
        System.out.println(result);
    }
}

//97 a 65 A