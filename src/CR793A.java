import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CR793A {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0)
        {
            int l = Integer.parseInt(buf.readLine());
                String s = buf.readLine();
                int i =s.length()/2;
                int j =s.length()/2;
                char ch=s.charAt(i);
                while(j<s.length()&&s.charAt(j)==ch)j++;
                while(i>=0&&s.charAt(i)==ch)i--;
                System.out.println(j-i+1-2);
        }
    }
}
