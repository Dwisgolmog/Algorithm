package 심화1;

import java.io.IOException;
import java.util.Scanner;

public class Num2444 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i=0; i<count; i++){
            for(int j=count; j>i+1; j--) System.out.print(" ");
            for(int c=0; c<i*2+1; c++) System.out.print("*");
            System.out.println();
        }

        for(int i=count-1; i>=0; i--){
            for(int j=0; j<count-i; j++) System.out.print(" ");
            for(int c=2; c<i*2+1; c++) System.out.print("*");
            System.out.println();
        }
    }
}
