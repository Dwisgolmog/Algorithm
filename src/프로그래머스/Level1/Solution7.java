package 프로그래머스.Level1;
import java.util.*;

//햄버거 만들기
public class Solution7 {
    class Solution {
        public int solution(int[] ingredient) {
            List<Integer> list = new ArrayList<>();
            for (int num : ingredient) {
                list.add(num);
            }
            int answer = 0;

            int i=0;
            while (i <= list.size() - 4) {
                if (list.get(i) == 1 && list.get(i + 1) == 2 && list.get(i + 2) == 3 && list.get(i + 3) == 1) {
                    list.subList(i, i+4).clear();
                    answer++;

                    i = Math.max(0, i - 3);
                    System.out.println(i);
                } else {
                    i++;
                }
            }


            return answer;
        }
    }
}
