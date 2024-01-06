import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AProblme {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(buf.readLine());
        t++;
        int ans =(t>>1)-1;
        ans=Math.max(ans,0);
        System.out.println(ans);
    }
}
//11 2
//10 3
//9 4
//8 5
//7 6
