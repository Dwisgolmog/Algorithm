package 백준.solvedac.class3;

import java.io.*;
public class Num10026 {

    static char[][] map;
    static boolean[][] visited1;
    static boolean[][] visited2;
    static int size;
    static int[] moveX = {-1, 1, 0, 0};
    static int[] moveY = {0, 0, -1, 1};

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        map = new char[size][size];
        visited1 = new boolean[size][size];
        visited2 = new boolean[size][size];

        for(int i=0; i<size; i++){
            map[i] = br.readLine().toCharArray();
        }

        int result1 = 0;
        int result2 = 0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(visited1[i][j] && visited2[i][j]) continue;

                if(!visited1[i][j]) {
                    DFS1(j,i,map[i][j]);
                    result1++;
                }
                if(!visited2[i][j]) {
                    DFS2(j,i,map[i][j]);
                    result2++;
                }

            }
        }

        System.out.println(result1+" "+result2);
    }

    public static void DFS1(int x,int y,char color){
        if(visited1[y][x]) return;

        visited1[y][x] = true;

        for(int i=0; i<4; i++){
            int nextX = x+moveX[i];
            int nextY = y+moveY[i];
            if( nextX >= 0 && nextX < size && nextY >= 0 && nextY <size
                    && !visited1[nextY][nextX] && map[nextY][nextX] == color){
                DFS1(nextX,nextY,color);
            }
        }
    }

    public static void DFS2(int x,int y,char color){
        if(visited2[y][x]) return;

        visited2[y][x] = true;

        for(int i=0; i<4; i++){
            int nextX = x+moveX[i];
            int nextY = y+moveY[i];
            if(nextX >= 0 && nextX < size && nextY >= 0 && nextY <size &&
                    !visited2[nextY][nextX] && isSameColor(map[nextY][nextX],color)){
                DFS2(nextX,nextY,color);
            }
        }
    }

    public static boolean isSameColor(char a, char b){
        if(a == b) return true;
        return (a == 'R' && b == 'G') || (a == 'G' && b == 'R');
    }
}
