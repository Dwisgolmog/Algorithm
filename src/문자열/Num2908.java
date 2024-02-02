import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        String temp = "";

        for(int i=A.length()-1; i >= 0; i--){
            temp += A.charAt(i);
        }
        A = temp;
        temp = "";
        for(int i=B.length()-1; i >= 0; i--){
            temp += B.charAt(i);
        }
        B = temp;

        temp = (Integer.parseInt(A) > Integer.parseInt(B)) ? A : B;
        System.out.println(temp);
    }
}
