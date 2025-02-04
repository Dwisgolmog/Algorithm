package 프로그래머스.Level1;

import java.util.*;

//대충 만든 자판
public class Solution6 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            HashMap<Character,Integer> map = new HashMap<>();
            int[] answer = new int[targets.length];

            for(int i=0; i<keymap.length; i++){
                char[] input = keymap[i].toCharArray();
                for(int j=0; j<input.length; j++){
                    int index = map.getOrDefault(input[j],101);
                    if(j < index){
                        map.put(input[j],j+1);
                    }
                }
            }

            for(int i=0; i<targets.length; i++){
                int result = 0;
                char[] input = targets[i].toCharArray();
                for(char c: input){
                    int value = map.getOrDefault(c,-1);
                    if(value == -1){
                        result = value;
                        break;
                    }
                    result += value;
                }
                answer[i] = result;
            }


            return answer;
        }
    }
}
