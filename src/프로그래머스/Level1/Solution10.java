package 프로그래머스.Level1;

import java.util.*;

//성격 유형 검사하기
public class Solution10 {
    class Solution {
        static HashMap<Character,Integer> map = new HashMap<>();

        public String solution(String[] survey, int[] choices) {
            map.put('R',0);
            map.put('T',0);
            map.put('C',0);
            map.put('F',0);
            map.put('J',0);
            map.put('M',0);
            map.put('A',0);
            map.put('N',0);

            char[] input = new char[2];
            for(int i=0; i<survey.length; i++){
                input = survey[i].toCharArray();
                choice(input,choices[i]);
            }

            String answer = result();
            return answer;

        }

        public static void choice(char[] input, int choice){
            if(choice == 1){
                map.put(input[0],map.get(input[0])+3);
            }else if(choice == 2){
                map.put(input[0],map.get(input[0])+2);
            }else if(choice == 3){
                map.put(input[0],map.get(input[0])+1);
            }else if(choice == 4){

            }else if(choice == 5){
                map.put(input[1],map.get(input[1])+1);
            }else if(choice == 6){
                map.put(input[1],map.get(input[1])+2);
            }else if(choice == 7){
                map.put(input[1],map.get(input[1])+3);
            }
        }

        public static String result(){
            StringBuilder sb = new StringBuilder();

            if(map.get('R') >= map.get('T')) sb.append("R");
            else sb.append("T");

            if(map.get('C') >= map.get('F')) sb.append("C");
            else sb.append("F");

            if(map.get('J') >= map.get('M')) sb.append("J");
            else sb.append("M");

            if(map.get('A') >= map.get('N')) sb.append("A");
            else sb.append("N");

            return sb.toString();
        }
    }
}
