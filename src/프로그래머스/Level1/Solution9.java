package 프로그래머스.Level1;

import java.util.*;

//숫자 짝꿍
public class Solution9 {
    class Solution {
        public String solution(String X, String Y) {
            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            StringBuilder sb = new StringBuilder();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<X.length(); i++){
                char input = X.charAt(i);
                if(map1.containsKey(input)) map1.put(input,map1.get(input)+1);
                else map1.put(input,1);
            }

            for(int i=0; i<Y.length(); i++){
                char input = Y.charAt(i);
                if(map2.containsKey(input)) map2.put(input,map2.get(input)+1);
                else map2.put(input,1);
            }

            for (Character key : map1.keySet()) {
                int commonCount = Math.min(map1.get(key), map2.getOrDefault(key, 0));
                for (int i = 0; i < commonCount; i++) {
                    list.add(key - '0');
                }
            }

            Collections.sort(list,Collections.reverseOrder());

            for(Integer num: list) sb.append(num);
            if(list.isEmpty()) sb.append(-1);
            if(sb.toString().charAt(0) == '0') return "0";

            return sb.toString();
        }
    }
}
