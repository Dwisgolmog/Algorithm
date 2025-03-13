package 카카오부트캠프;

import java.io.*;

public class Num31403 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C));
        System.out.println(Integer.parseInt(A+B)-Integer.parseInt(C));
    }
}
