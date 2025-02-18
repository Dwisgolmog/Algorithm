package 프로그래머스.Level1;

//삼총사
public class Solution8 {
    class Solution {
        public int solution(int[] number) {
            int answer = 0;

            for(int i=0; i<number.length-2; i++){

                for(int j=i+1; j<number.length-1; j++){

                    for(int c=j+1; c<number.length; c++){
                        if(number[i]+number[j]+number[c] == 0) answer++;
                    }
                }
            }

            return answer;
        }
    }
}
