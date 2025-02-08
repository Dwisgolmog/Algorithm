package 백준.정렬;

import java.io.*;
import java.util.*;

public class Num18870 {
    //해쉬셋에 넣고 -> ArrayList로 받음 -> 정렬 때리고 -> 정렬한값 해쉬맵에 넣고 -> 원래 배열의 값을 해쉬셋의 value로 치환
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        int[] result = new int[count];
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            result[i] = num;
            set.add(num);
        }

        List<Integer> cpResult = new ArrayList<>(set);
        Collections.sort(cpResult);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<cpResult.size(); i++){
            map.put(cpResult.get(i),i);
        }

        for(int i=0; i<count; i++){
            result[i] = map.get(result[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i : result){
            sb.append(i+" ");
        }

        System.out.println(sb);
    }
}
