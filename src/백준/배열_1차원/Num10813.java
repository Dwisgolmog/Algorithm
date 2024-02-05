package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10813 {
    public static void main(String args[])throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int firstIndex = 0;
        int secondIndex= 0;
        int tmp =0;

        st = new StringTokenizer(bf.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())]; //버퍼에 처음 입력한 숫자의 크기만큼 바구니 갯수를 지정
        int count = Integer.parseInt(st.nextToken());

        //바구니의 크기만큼 공을 채움
        for(int i=0; i<basket.length; i++){
            basket[i] = i+1;
        }

        for(int i=0; i<count; i++){
            st = new StringTokenizer(bf.readLine());
            firstIndex = Integer.parseInt(st.nextToken()) -1;
            secondIndex = Integer.parseInt(st.nextToken()) -1;
            tmp = basket[firstIndex];
            basket[firstIndex] = basket[secondIndex];
            basket[secondIndex] = tmp;
        }

        for(int num:basket){
            System.out.print(num+" ");
        }

    }
}
