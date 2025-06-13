package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Num1002 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bf.readLine());

        for(int c=0; c<count; c++){
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int[][] person = new int[2][3];

            for(int i=0; i<2; i++){
                for(int j=0; j<3; j++){
                    person[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int radiusA = person[0][2];
            int radiusB = person[1][2];
            int distance = (int)(Math.pow(person[0][0] - person[1][0],2) + Math.pow(person[0][1] - person[1][1],2));


            if(person[0][0] == person[1][0] && person[0][1] == person[1][1] && person[0][2] == person[1][2]){
                bw.write(-1+"\n");
            }else if(Math.pow(radiusA-radiusB,2)<distance && distance < Math.pow(radiusA+radiusB,2)){
                bw.write(2+"\n");
            }else if(Math.pow(radiusA+radiusB,2) == distance || Math.pow(radiusA-radiusB,2) == distance){
                bw.write(1+"\n");
            }else{
                bw.write(0+"\n");
            }

        }

        bw.flush();
        bw.close();
    }
}
