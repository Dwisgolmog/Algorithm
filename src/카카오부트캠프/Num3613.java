package 카카오부트캠프;

import java.io.*;
public class Num3613 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input =  br.readLine().toCharArray();
        boolean java = false;
        boolean c = false;

        //1.첫글자와 끝글자의 언더바 검사 , 첫글자 대문자 검사
        if(input[0] == '_' || input[input.length - 1] == '_' || Character.isUpperCase(input[0])){
            System.out.println("Error!");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length; i++){
            if(input[i] == '_' && i < input.length -1){
                if(input[i+1] == '_') { //2.연속된 언더바 검사
                    System.out.println("Error!");
                    return;
                }

                i++;
                if(Character.isUpperCase(input[i])){
                    System.out.println("Error!");
                    return;
                }else{
                    sb.append(Character.toUpperCase(input[i]));
                }
                java = true;
            }else if(input[i] < 'a'){
                sb.append("_").append(Character.toLowerCase(input[i]));
                c = true;
            }else{
                sb.append(input[i]);
            }
        }

        if(java && c) { //3.대문자 언더바 혼용 검사
            System.out.println("Error!");
        }else{
            System.out.println(sb);
        }

    }
}
