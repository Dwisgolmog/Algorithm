package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num12891 {

    static int myCount[]; //현재 포함되어있는 부분 문자열 갯수
    static int count[]; //부분문자열에 포함되어야 할 갯수
    static char arr[]; // 문자열

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dnaLength = Integer.parseInt(st.nextToken()); //DNA 문자열 길이
        int passwordLength = Integer.parseInt(st.nextToken()); //사용할 부분문자열 길이

        String str = br.readLine();
        arr = str.toCharArray();

        count = new int[4];
        st = new StringTokenizer(br.readLine());
        myCount = new int[4];
        
        for(int i=0; i<count.length; i++){
            count[i] = Integer.parseInt(st.nextToken());
        }

        int start_point = 0;
        int end_point = passwordLength;
        int result = 0;

        for(int i=start_point; i<end_point; i++){
            addChar(i);
        }

        if(compareCount())
            result++;

        while(end_point < dnaLength){
            addChar(end_point);
            removeChar(start_point);

            if(compareCount())
                result++;

            start_point++;
            end_point++;
        }
        System.out.println(result);
    }
    public static void addChar(int end_point){
        if(arr[end_point] == 'A'){
            myCount[0]++;
        } else if (arr[end_point] == 'C'){
            myCount[1]++;
        } else if (arr[end_point] == 'G'){
            myCount[2]++;
        } else if (arr[end_point] == 'T'){
            myCount[3]++;
        }
    }
    public static void removeChar(int start_point){
        if(arr[start_point] == 'A'){
            myCount[0]--;
        } else if (arr[start_point] == 'C') {
            myCount[1]--;
        } else if (arr[start_point] == 'G') {
            myCount[2]--;
        } else if (arr[start_point] == 'T') {
            myCount[3]--;
        }
    }
    public static boolean compareCount(){
        return myCount[0] >= count[0] && myCount[1] >= count[1] && myCount[2] >= count[2] && myCount[3] >= count[3];
    }
}
