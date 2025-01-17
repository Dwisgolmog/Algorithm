package 프로그래머스.Level1;

//바탕화면 정리
class Solution4 {
    public int[] solution(String[] wallpaper) {
        int[][] newMap = new int[wallpaper.length][wallpaper[0].length()];
        int startX = Integer.MAX_VALUE;
        int startY = Integer.MAX_VALUE;
        int endX = Integer.MIN_VALUE;
        int endY = Integer.MIN_VALUE;

        for(int i=0; i<wallpaper.length; i++){
            int startPoint = wallpaper[i].indexOf('#');
            int endPoint = wallpaper[i].lastIndexOf('#');

            if(startPoint != -1){
                if(startX > startPoint) startX = startPoint;
                if(startY > i) startY = i;
                if(endX < endPoint) endX = endPoint;
                if(endY < i) endY = i;
            }
        }

        int[] answer = {startY,startX,endY+1,endX+1};
        return answer;
    }
}
