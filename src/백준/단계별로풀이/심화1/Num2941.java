package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2941 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count =0;

        for(int i=0; i<str.length(); i++){
            char alphabet = str.charAt(i);
            if(i+1 != str.length()){
                if(alphabet == 'c'){
                    if(str.charAt(i+1) == '-' || str.charAt(i+1) == '='){
                        i++;
                    }
                }else if(alphabet == 'd'){
                    if(str.charAt(i+1) == '-'){
                        i++;
                    }else if(i+2 != str.length()){
                        if(str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') i = i + 2;
                    }
                }else if(alphabet == 'l'){
                    if(str.charAt(i+1) == 'j') i++;
                }else if(alphabet == 'n'){
                    if(str.charAt(i+1) == 'j') i++;
                }else if(alphabet == 's'){
                    if(str.charAt(i+1) == '=') i++;
                }else if(alphabet == 'z'){
                    if(str.charAt(i+1) == '=') i++;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
