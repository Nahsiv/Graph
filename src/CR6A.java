import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CR6A {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0)
        {
            int a =Integer.parseInt(buf.readLine());
            System.out.println(1+" "+(a-1));
        }
    }
}
