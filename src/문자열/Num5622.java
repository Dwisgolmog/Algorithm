import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String strArray[][] = {{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};

        String strNumber = bf.readLine();
        String number;
        int time = 0;

        for(int i=0; i<strNumber.length(); i++){
            number = Character.toString(strNumber.charAt(i));
            for(int j=0; j<8; j++){
                if(Arrays.asList(strArray[j]).contains(number)){
                    time += j+3;
                }
            }
        }
        System.out.println(time);
    }
}
