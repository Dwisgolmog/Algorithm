package 카카오부트캠프;

import java.io.*;

public class Num8958 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int result = 0;
            int stackNumber = 0;

            char[] list = br.readLine().toCharArray();
            for(int j=0; j<list.length; j++){
                if(list[j] == 'O'){
                    stackNumber++;
                    result += stackNumber;
                }else{
                    stackNumber = 0;
                }
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
