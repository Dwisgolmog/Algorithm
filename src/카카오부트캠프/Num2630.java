package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num2630 {

    static int blue = 0;
    static int white = 0;
    static int[][] square;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        square = new int[size][size];
        StringTokenizer st;

        for(int i=0; i<size; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<size; j++){
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        slice(0,0,size);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void slice(int row,int col,int size){
        if(colorCheck(row,col,size)){
            if(square[row][col] == 0){
                white++;
            }else{
                blue++;
            }

            return;
        }

        int newSize = size/2;
        slice(row,col,newSize);
        slice(row+newSize,col,newSize);
        slice(row,col+newSize,newSize);
        slice(row + newSize, col + newSize, newSize);
    }

    public static boolean colorCheck(int row,int col,int size){
        int color = square[row][col];

        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(square[i][j] != color){
                    return false;
                }
            }
        }

        return true;
    }
}
