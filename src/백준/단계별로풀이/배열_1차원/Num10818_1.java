package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num10818_1 {
    public static void main(String args[])throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        int[] arr = new int[count];
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());

        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[count - 1]);

    }
}
