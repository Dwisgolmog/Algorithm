package 프로그래머스.Level1;

//덧칠하기
public class Solution5 {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int point = section[0] + m;

        for(int i=1; i<section.length; i++){
            if(point <= section[i]){
                answer++;
                point = section[i] + m;
            }
        }

        return answer;
    }
}
