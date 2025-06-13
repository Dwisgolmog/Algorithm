package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Num3052_1 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<10; i++){
            numbers[i] = Integer.parseInt(br.readLine())%42;
        }

        map.put(numbers[0],1);

        for(int i=1; i<10; i++){
            count = 0;
            for(Map.Entry<Integer,Integer> e : map.entrySet()){
                if(e.getKey() == numbers[i]) {
                    map.put(e.getKey(), map.get(e.getKey()) + 1);
                    count++;
                }
            }
            if(count == 0) map.put(numbers[i],1);
        }

        System.out.println(map.size());
    }
}
