import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String text = bf.readLine();
        StringTokenizer st = new StringTokenizer(text);
        System.out.println(st.countTokens());

    }
}
