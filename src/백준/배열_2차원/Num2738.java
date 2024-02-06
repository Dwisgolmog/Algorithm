package 배열_2차원;

import java.io.*;
import java.util.StringTokenizer;

public class Num2738 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int[][] numArray = new int[row][column];

        for(int i=0; i<row; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<column; j++){
                numArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<row; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<column; j++){
                if(st.hasMoreTokens()){
                    bw.write(numArray[i][j]+Integer.parseInt(st.nextToken()) + " ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
