package 배열_2차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2563 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] drawingPaper = new boolean[100][100];
        int count = Integer.parseInt(br.readLine());
        int x =0;
        int y =0;
        int result = 0;

        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int j=0; j<10; j++){
                for(int c=0; c<10; c++){
                    if(!drawingPaper[x+j][y+c]){
                        drawingPaper[x+j][y+c] = true;
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
