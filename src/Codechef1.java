import java.io.*;
import java.util.*;

public class Codechef1 {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static long[] getArray(StringTokenizer a, int l) {
        long[] arr = new long[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
            int n =Integer.parseInt(buf.readLine());
            long[]arr= getArray(new StringTokenizer(buf.readLine()),n);
            Arrays.sort(arr);
            for(int i=n-2;i>=0;i--)
                arr[i]+=arr[i+1];
            StringBuilder ans = new StringBuilder();
            for(long i:arr)ans.append(i).append(" ");
            System.out.println(ans);
        }

    }
}
