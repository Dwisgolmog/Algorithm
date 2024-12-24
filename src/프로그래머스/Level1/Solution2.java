package 프로그래머스.Level1;
import java.util.*;

//추억 점수
class Solution2 {
    public int[] Solution2(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];

        Map<String, Integer> pointMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            pointMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                score += pointMap.getOrDefault(person, 0);
            }
            result[i] = score;
        }

        return result;
    }
}