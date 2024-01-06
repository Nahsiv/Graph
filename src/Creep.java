import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Creep {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
            StringTokenizer st = new StringTokenizer(buf.readLine());
            int z =Integer.parseInt(st.nextToken());
            int o =Integer.parseInt(st.nextToken());
            StringBuilder ans = new StringBuilder();
            while(z>0&&o>0)
            {
                ans.append(0).append(1);
                z--;
                o--;
            }
            while (z>0)
            {
                ans.append(0);
                z--;
            }
            while (o>0)
            {
                ans.append(1);
                o--;
            }
            System.out.println(ans);
        }
    }
}
