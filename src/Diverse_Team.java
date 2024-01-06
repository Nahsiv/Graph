import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Diverse_Team {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int n =Integer.parseInt(st.nextToken());
        int k =Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> hs = new HashMap<>();
        StringTokenizer ar = new StringTokenizer(buf.readLine());
        StringBuilder ans = new StringBuilder();
        int i=0;
        while (n-->0)
        {
            hs.put(Integer.parseInt(ar.nextToken()),++i);
        }
        if(hs.size()<k) System.out.println("NO");
        else{
            System.out.println("YES");
            for(int i1:hs.values())
            {
                k--;
                if(k>=0)ans.append(i1).append(" ");
                else break;
            }
            System.out.println(ans);
        }
    }
}
