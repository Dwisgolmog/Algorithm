package 카카오부트캠프;

import java.io.*;
import java.util.*;

public class Num28702 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = 0;
        int nextNum = 0;
        int num = 0;

        for(int i=0; i<3; i++){
            String input = br.readLine();
            char c = input.charAt(0);

            if(c > 'A') continue;

            inputNum = Integer.parseInt(input);
            nextNum = 3-i;
        }

        num = inputNum + nextNum;
        if(num % 3 == 0){
            if(num % 5 == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println("Fizz");
            }
        }else if(num % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }

    }
}
