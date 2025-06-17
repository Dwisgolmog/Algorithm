package 백준.단계별로풀이.백트래킹;

import java.io.*;

public class Num9663 {

    static int[] arr;
    static int size;
    static int result = 0;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr = new int[size];

        DFS(0);
        System.out.println(result);
    }

    public static void DFS(int depth){
        if(depth == size){
            result++;
            return;
        }

        for(int i=0; i<size; i++){
            arr[depth] = i;

            if(check(depth)){
                DFS(depth + 1);
            }
        }
    }

    public static boolean check(int depth){
        for(int i=0; i<depth; i++){
            if(arr[depth] == arr[i]) return false;
            else if(Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) return false;
        }

        return true;
    }
}
