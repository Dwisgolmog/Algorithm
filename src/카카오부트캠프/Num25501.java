package 카카오부트캠프;

import com.sun.security.jgss.GSSUtil;

import java.io.*;

public class Num25501 {
    static int count;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++){
            String input = br.readLine();
            count = 0;
            int result = isPalindrome(input);
            sb.append(result).append(" ").append(count).append("\n");
        }

        System.out.println(sb);

    }
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
