package 프로그래머스.Level1;

import java.util.*;

//달리기 경주
class Solution1 {
    public String[] solution(String[] players, String[] callings) {

        String temp;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i],i);
        }

        for(String c:callings){
            int index = map.get(c);

            if (index == 0) continue;

            temp = players[index - 1];
            players[index - 1] = players[index];
            players[index] = temp;

            map.put(players[index], index);
            map.put(players[index - 1], index - 1);
        }

        return players;
    }
}