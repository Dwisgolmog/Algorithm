package 백준.단계별로풀이.입출력과사칙연산;
import java.util.*;
public class Num10430 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println(a*b%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
