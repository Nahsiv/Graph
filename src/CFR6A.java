import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFR6A {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0)
        {
            String a = buf.readLine();
            String b = buf.readLine();
            String c = buf.readLine();
            boolean ans =true;
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)==c.charAt(i)||b.charAt(i)==c.charAt(i))continue;
                ans =false;
                break;
            }
            System.out.println(ans?"YES":"NO");
        }
    }
}
