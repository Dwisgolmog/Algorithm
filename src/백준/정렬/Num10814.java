package 백준.정렬;

import java.io.*;
import java.util.*;

public class Num10814 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        Person[] person = new Person[count];

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            person[i] = new Person(Integer.parseInt(st.nextToken()),st.nextToken());
        }

        Arrays.sort(person,(a,b) ->{
           return Integer.compare(a.age,b.age);
        });

        StringBuilder sb = new StringBuilder();

        for(Person p: person){
            sb.append(p.toString()).append("\n");
        }

        System.out.println(sb);
    }

    public static class Person{
        int age;
        String name;

        public Person(int age,String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
