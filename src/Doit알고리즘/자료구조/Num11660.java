package Doit알고리즘.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arraySize = Integer.parseInt(st.nextToken());
        int inputCount = Integer.parseInt(st.nextToken());
        int[][] array = new int[arraySize + 1][arraySize + 1];

        for (int i = 1; i <= arraySize; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= arraySize; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] arraySum = new int[arraySize + 1][arraySize + 1];
        for (int i = 1; i <= arraySize; i++) {
            for (int j = 1; j <= arraySize; j++) {
                arraySum[i][j] = arraySum[i][j - 1] + arraySum[i - 1][j] - arraySum[i - 1][j - 1] + array[i][j];
            }
        }

        for (int i = 0; i < inputCount; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(arraySum[x2][y2] - arraySum[x1 - 1][y2] - arraySum[x2][y1 - 1] + arraySum[x1 - 1][y1 - 1]); // 수정된 부분
        }
    }
}
