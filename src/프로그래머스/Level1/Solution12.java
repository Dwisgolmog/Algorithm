package 프로그래머스.Level1;

//없는 숫자 더하기
public class Solution12 {
    class Solution {
        public int solution(int[] numbers) {

            int result = 0;
            for(int i=0; i<numbers.length; i++){
                result += numbers[i];
            }

            return 45 - result;
        }
    }
}
