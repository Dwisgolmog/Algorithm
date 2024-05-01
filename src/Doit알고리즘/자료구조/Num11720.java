package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제 속도:80ms 코드길이:443B
public class Num11720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String inputNum = br.readLine();
        int result = 0;

        for(int i=0; i<count; i++){
            result += inputNum.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
