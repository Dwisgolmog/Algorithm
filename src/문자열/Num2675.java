    package 문자열;

    import java.io.*;
    import java.util.*;
    public class Num2675 {
        public static void main(String args[]) throws Exception{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int count = Integer.parseInt(bf.readLine());
            int retry = 0;

            for(int i=0; i<count; i++){
                st = new StringTokenizer(bf.readLine());
                retry = Integer.parseInt(st.nextToken());
                String inputStr = st.nextToken();

                for(int j=0; j<inputStr.length(); j++){
                    char outputChar = inputStr.charAt(j);
                    for(int c=0; c<retry; c++){
                        System.out.print(outputChar);
                    }
                }
                System.out.println();
            }
        }
    }
