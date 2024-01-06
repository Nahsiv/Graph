import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        boolean ans =(t&1)==0&&t!=2;
        System.out.println(ans?"YES":"NO");
    }
}
