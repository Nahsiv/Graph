import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakeAEqualToB {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
            int l = Integer.parseInt(buf.readLine());
            String[]a= buf.readLine().split(" ");
            String[]b = buf.readLine().split(" ");
            int rans=0;
            for(int i=0;i<l;i++)if(!a[i].equals(b[i]))rans++;
            Arrays.sort(a);
            Arrays.sort(b);
            StringBuilder p = new StringBuilder();
            StringBuilder q = new StringBuilder();
            for(String p1:a)p.append(p1);
            for(String p1:b)q.append(p1);
            int ans=0;
            for(int i =0;i<p.length();i++)
            {
                if(p.charAt(i)!=q.charAt(i))ans++;
            }
            ans++;
            ans=Math.min(ans,rans);
            System.out.println(ans);
        }
    }
}
