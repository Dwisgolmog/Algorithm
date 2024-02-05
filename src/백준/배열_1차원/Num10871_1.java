package 배열_1차원;

import java.util.Scanner;

public class Num10871_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int boolNum = sc.nextInt();
        int[] numbers = new int[count];

        for(int i=0; i<count; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < boolNum) System.out.println(numbers[i]);
        }
    }
}
