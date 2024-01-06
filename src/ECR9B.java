import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ECR9B {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0)
        {
            String[]ad = buf.readLine().split(" ");
            int n=Integer.parseInt(ad[0]);
            int k =Integer.parseInt(ad[1]);
            String[]ar = buf.readLine().split(" ");
            ArrayList<Integer>al = new ArrayList<>();
            for(int i=0;i<n;i++)al.add(Integer.parseInt(ar[i]));
            Collections.sort(al);
//            Collections.sort(al,Collections.reverseOrder());
            long ans=0;
            for(int i=n-1;i>=n-1-k;i--)ans+=al.get(i);
            System.out.println(ans);
        }
    }
}
