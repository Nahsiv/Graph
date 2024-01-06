import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CFR5A {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(buf.readLine());
        while (q-->0)
        {
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            long n = Long.parseLong(ed.nextToken());
            int a =Integer.parseInt(ed.nextToken());
            int b =Integer.parseInt(ed.nextToken());
            long ans =Math.min(n*a, (n>>1)*b+(n%2)*a);
            System.out.println(ans);
        }
    }
}
