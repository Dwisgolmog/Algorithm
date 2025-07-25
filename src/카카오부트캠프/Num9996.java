package 카카오부트캠프;

import java.io.*;

public class Num9996 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();

        String[] splitResult = input.split("\\*");
        char[] prefix = splitResult[0].toCharArray();
        char[] suffix = splitResult[1].toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            char[] arr = br.readLine().toCharArray();
            int boolNum = 1;

            if(arr.length < prefix.length + suffix.length) {
                sb.append("NE").append("\n");
                continue;
            }

            for(int j=0; j<prefix.length; j++){
                if(prefix[j] == arr[j]) continue;
                else{
                    boolNum *= 0;
                    break;
                }
            }

            for(int j=0; j<suffix.length; j++){
                if(suffix[j] == arr[arr.length-suffix.length+j]) continue;
                else{
                    boolNum *= 0;
                    break;
                }
            }

            if(boolNum == 1) sb.append("DA").append("\n");
            else sb.append("NE").append("\n");
        }

        System.out.println(sb);
    }
}
