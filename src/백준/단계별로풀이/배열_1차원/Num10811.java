package 배열_1차원;

import java.io.*;
import java.util.StringTokenizer;

public class Num10811 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketSize = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] basket = new int[basketSize];

        for(int i=0; i<basketSize; i++){
            basket[i] = i+1;
        }

        int firstNum =0;
        int secondNum = 0;
        int temp = 0;

        for(int i=0; i<count; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            firstNum = Integer.parseInt(st2.nextToken())-1;
            secondNum = Integer.parseInt(st2.nextToken())-1;
            int tryCount = secondNum;

            for(int j=firstNum; j<tryCount; j++){
                if(secondNum <= j) break;
                temp = basket[j];
                basket[j] = basket[secondNum];
                basket[secondNum] = temp;
                secondNum--;

            }
        }

        for(int i=0; i<basketSize; i++){
            bw.write(Integer.toString(basket[i])+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
