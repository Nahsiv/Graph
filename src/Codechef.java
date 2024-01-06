import java.io.*;
import java.util.*;

public class Codechef {
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
            int l = Integer.parseInt(buf.readLine());
            int[]arr =getArray(new StringTokenizer(buf.readLine()),l);
            HashSet<Integer>hs = new HashSet<>();
            int ans=0;
            for(int i:arr){
                if(hs.contains(i))hs.remove(i);
                else hs.add(i);
                ans=Math.max(ans,hs.size());
            }
            System.out.println(ans);
        }

    }
}
