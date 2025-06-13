package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());

        int count = Integer.parseInt(st.nextToken());
        int boolNum  = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int num =0;
        for(int i=0; i<count; i++){
            num = Integer.parseInt(st.nextToken());
            if(boolNum>num){
                list.add(num);
            }
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
