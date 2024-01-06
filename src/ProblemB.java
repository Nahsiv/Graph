import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(buf.readLine());
        while (t-->0)
        {
            int t1=Integer.parseInt(buf.readLine());
            String s= buf.readLine();
            int ans =s.length();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1') {
                    ans = Math.max(ans,(s.length()-i)<<1);
                    ans=Math.max(ans,(i+1)<<1);
                }
            }
            System.out.println(ans);
        }
    }
}
