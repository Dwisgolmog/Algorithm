package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num25206 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double credit = 0; //학점
        String grade = ""; //과목평점
        double totalCredit = 0; //이수학점
        double result = 0; //평균값

        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            grade = st.nextToken();
            if(!grade.equals("P")) totalCredit += credit;

            switch (grade) {
                case "A+":
                    result += credit * 4.5;
                    break;
                case "A0":
                    result += credit * 4.0;
                    break;
                case "B+":
                    result += credit*3.5;
                    break;
                case "B0":
                    result += credit*3.0;
                    break;
                case "C+":
                    result += credit*2.5;
                    break;
                case "C0":
                    result += credit*2.0;
                    break;
                case "D+":
                    result += credit*1.5;
                    break;
                case "D0":
                    result += credit;
                    break;
                case "F":
                    result += credit*0;
                    break;
            }
        }

        System.out.printf("%.6f",result/totalCredit);
    }
}
