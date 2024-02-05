package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10810 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int firstIndex =0;
        int secondIndex = 0;
        int inputNum = 0;

        st = new StringTokenizer(br.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())]; //버퍼에 처음 입력한 숫자의 크기만큼 바구니 갯수를 지정
        int count = Integer.parseInt(st.nextToken());

        while(count-- > 0){ //이중 for문 대신 가독성의 차이를 위해 채택
            st = new StringTokenizer(br.readLine());
            firstIndex = Integer.parseInt(st.nextToken()) - 1;
            secondIndex = Integer.parseInt(st.nextToken()) - 1;
            inputNum = Integer.parseInt(st.nextToken());

            for(int i=firstIndex; i<=secondIndex; i++){
                basket[i] = inputNum;
            }
        }

        for(int num:basket){
            System.out.print(num+" ");
        }

    }
}
