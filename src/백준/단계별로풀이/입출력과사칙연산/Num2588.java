package 백준.단계별로풀이.입출력과사칙연산;
import java.util.*;
public class Num2588 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b = 0;

        a = sc.nextInt();
        b = sc.nextInt();


        System.out.println(a*(b%10));
        System.out.println(a*(b%100-b%100%10)/10);
        System.out.println(b/100*a);
        System.out.println(a*b);
    }
}
