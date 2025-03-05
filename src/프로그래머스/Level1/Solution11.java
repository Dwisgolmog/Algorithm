package 프로그래머스.Level1;
import java.util.*;

//신고 결과 받기
public class Solution11 {

    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            HashMap<String, Integer> map = new HashMap<>();  // 신고 횟수 저장
            HashMap<String, HashSet<String>> reportMap = new HashMap<>(); // 신고자 목록 저장
            HashMap<String, Integer> result = new HashMap<>();  // 결과 저장
            StringTokenizer st;
            int[] answer = new int[id_list.length];

            for (String id : id_list) {
                map.put(id, 0);
                reportMap.put(id, new HashSet<>());
                result.put(id, 0);
            }

            // 신고 처리
            for (String r : report) {
                st = new StringTokenizer(r);
                String a = st.nextToken();
                String b = st.nextToken();

                if (!reportMap.get(b).contains(a)) {
                    reportMap.get(b).add(a);
                    map.put(b, map.get(b) + 1);
                }
            }

            // 정지된 사용자 목록 확인 후 결과 계산
            for (String key : map.keySet()) {
                if (map.get(key) >= k) {
                    for (String reporter : reportMap.get(key)) {
                        result.put(reporter, result.get(reporter) + 1);
                    }
                }
            }

            // 결과 배열로 변환
            for (int i = 0; i < id_list.length; i++) {
                answer[i] = result.get(id_list[i]);
            }

            return answer;
        }
    }
}
