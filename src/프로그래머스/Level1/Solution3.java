package 프로그래머스.Level1;

import java.util.*;

//공원 산책
public class Solution3 {
    public int[] solution(String[] park, String[] routes) {
        int[] startPoint = new int[2];
        char[][] newMap = new char[park.length][park[0].length()];

        for(int i=0; i<park.length; i++){
            int start = park[i].indexOf("S");
            if(start != -1){
                startPoint[0] = i;
                startPoint[1] = start;
            }
            newMap[i] = park[i].toCharArray();
        }

        for(int i=0; i<routes.length; i++){
            String input[] = routes[i].split(" ");
            int move = Integer.parseInt(input[1]);

            int[] num = movePoint(startPoint,input[0],move,newMap);
            startPoint = Arrays.copyOf(num,2);
        }

        return startPoint;
    }
    public int[] movePoint(int[] startPoint,String direction,int move,char[][] newMap){
        int[] point = Arrays.copyOf(startPoint,2);

        for(int i=0; i<move; i++){
            if(direction.equals("E")){
                point[1] += 1;
                if(point[1] >= newMap[0].length || newMap[point[0]][point[1]] == 'X') return startPoint;
            }else if(direction.equals("W")){
                point[1] -= 1;
                if(point[1] < 0 || newMap[point[0]][point[1]] == 'X') return startPoint;
            }else if(direction.equals("S")){
                point[0] += 1;
                if(point[0] >= newMap.length || newMap[point[0]][point[1]] == 'X') return startPoint;
            }else{
                point[0] -= 1;
                if(point[0] < 0 || newMap[point[0]][point[1]] == 'X') return startPoint;
            }
        }

        return point;
    }
}
