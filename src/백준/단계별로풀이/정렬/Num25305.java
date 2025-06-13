package 백준.단계별로풀이.정렬;

import java.io.*;
import java.util.*;

public class Num25305 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] students = new Integer[Integer.parseInt(st.nextToken())];
        int cutStudents = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<students.length; i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(students,Collections.reverseOrder());

        System.out.println(students[cutStudents-1]);
    }
}
