package 카카오부트캠프;

import java.io.*;

public class Num24723 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int greenTower = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(2,greenTower));
    }
}
