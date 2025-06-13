package 백준.단계별로풀이.etc;

import java.io.*;
import java.util.*;

public class Num1744 {

    static int result = 0;
    public static void main(String[] args)throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> pn = new ArrayList<>();
        List<Integer> nn = new ArrayList<>();

        for(int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > 0) pn.add(num);
            else nn.add(num);
        }

        Collections.sort(pn,Collections.reverseOrder());
        Collections.sort(nn);

        sum(pn);
        sum(nn);

        System.out.println(result);
    }

    public static void sum(List<Integer> list ){
        int i = 0;
        while(i <list.size()){
            if(i + 1 < list.size() && list.get(i) != 1 && list.get(i+1) != 1){
                result += list.get(i) * list.get(i+1);
                i +=  2;
            }else{
                result += list.get(i);
                i++;
            }
        }
    }
}
