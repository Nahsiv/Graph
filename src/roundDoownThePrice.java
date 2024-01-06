import java.io.*;
import java.util.*;

public class roundDoownThePrice {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(buf.readLine());
        while (t-->0){
            int r =Integer.parseInt(buf.readLine());
            int ans=0;
            long rans=r;
            while (true)
            {
                long q=(long)Math.pow(10,ans);
                ans++;
                if(q>r)break;
                rans=r-q;
            }
            System.out.println(rans);
        }

    }
}
