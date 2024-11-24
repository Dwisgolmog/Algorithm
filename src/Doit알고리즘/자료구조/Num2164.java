package Doit알고리즘.자료구조;
import java.io.*;
import java.util.*;
public class Num2164 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int cardSize = Integer.parseInt(br.readLine());

        for(int i=1; i<=cardSize; i++){
            queue.add(i);
        }

        int num;
        while(queue.size() != 1){
            queue.remove();
            num = queue.remove();
            queue.add(num);
        }

        System.out.println(queue.remove());
    }
}
