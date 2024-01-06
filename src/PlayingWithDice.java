import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayingWithDice {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int a =Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        int aw=0;
        int d=0;
        int bw=0;
        for(int i=1;i<=6;i++)
        {
            int da=Math.abs(i-a);
            int db=Math.abs(i-b);
            if(da==db)d++;
            else if(da<db)aw++;
            else bw++;
        }
        StringBuilder ans = new StringBuilder();
        ans.append(aw).append(" ").append(d).append(" ").append(bw);
        System.out.println(ans);
    }
}
