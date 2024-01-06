import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DominoPiling {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(buf.readLine());
        int a= Integer.parseInt(str.nextToken());
        int b= Integer.parseInt(str.nextToken());
        int p= a-(a&1);
        int q=b-(b&1);
        int ans =(p*q)>>1;
        ans+=((a&1)*b)>>1;
        ans+=((b&1)*a)>>1;
        System.out.println(ans);
    }
}
