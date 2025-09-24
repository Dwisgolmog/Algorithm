package 백준.solvedac.class3;

import java.io.*;

public class Num5525 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) * 2 + 1;
        int strSize = Integer.parseInt(br.readLine());
        char[] str = new char[strSize];

        str = br.readLine().toCharArray();

        int result = 0;
        for(int i=0; i<= strSize-N; i++){
            char input = str[i];
            if(input != 'I') continue;

            int count = 1;
            boolean toggle = true;
            while(count < N){
                if(toggle && str[i+count] == 'O'){
                    count++;
                } else if(!toggle && str[i+count] == 'I'){
                    count++;
                } else {
                    break;
                }

                toggle = !toggle;
            }
            if(count == N) result++;
        }

        System.out.println(result);
    }
}
