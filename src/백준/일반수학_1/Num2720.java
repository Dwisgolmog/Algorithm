package 일반수학_1;

import java.io.*;

public class Num2720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        int money = 0;

        for(int i=0; i<count; i++){
            money = Integer.parseInt(br.readLine());

            sb.append(money/25).append(" ");
            money = money%25;

            sb.append(money/10).append(" ");
            money = money%10;

            sb.append(money/5).append(" ");
            money = money%5;

            sb.append(money/1).append(" ");
        }

        System.out.println(sb);
    }
}
