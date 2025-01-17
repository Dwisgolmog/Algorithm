package 프로그래머스.Level2.교점에별만들기;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public String[] solution(int[][] line){
        //배열의 크기를 담을 비교 변수
        int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;

        String[] answer = {};
        //HashSet은 중복된 값을 허용 x , 순서 보장 x (set의 성질을 가짐)
        HashSet<Star> pSet = new HashSet<>();

        // 두 교점을 구하는 공식
        // x = (bf-ed)/(ad-bc)
        // y = (ec-af)/(ad-bc)
        int x,y;
        for(int i=0; i<line.length-1; i++){
            int a = line[i][0];
            int b = line[i][1];
            int c = line[i][2];
            for(int j=i+1; j<line.length; j++){
                int d = line[j][0];
                int e = line[j][1];
                int f = line[j][2];

                int adbc = a*d - b*c;
                int bfed = b*f - e*d;
                int ecaf = e*c - a*f;


                // ad - bc = 0인 경우 두 직선은 평행또는 일치함
                if(adbc == 0) continue;

                //정수인 좌표만을 별로 찍어야 함으로 정수가 아닌 값은 제외시킨다
                if(bfed%adbc != 0) continue;

                if(ecaf%adbc != 0) continue;

                x = bfed/adbc;
                y = ecaf/adbc;

                pSet.add(new Star(x,y));
                minx = Math.min(minx,x);
                miny = Math.min(miny,y);
                maxx = Math.max(maxx,x);
                maxy = Math.max(maxy,y);
            }
        }

        // 좌표값의 차이를 없애기 위해 +1을 해주었음
        // x의값이 5와 2 사이에는 2,3,4,5 4개가 존재하지만 5-2를 하면 3이 나오기 때문에 +1을 한 것임
        int height = maxy-miny + 1;
        int width = maxx-minx + 1;

        //배열의 모든 요소를 "."으로 채우기
        answer = new String[height];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<width; i++) sb.append(".");
        Arrays.fill(answer,sb.toString());


        for(Star st : pSet){

        }

        return answer;
    }

    //좌표값을 담아 해쉬셋에 저장할 클래스
    public class Star{
        public int x;
        public int y;
        public Star(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
