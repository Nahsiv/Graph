import java.io.*;
import java.util.*;

public class VanyaAndFence {
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
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int n =getInput(st);
        int h =getInput(st);
        int[]arr=getArray(new StringTokenizer(buf.readLine()),n);
        int ans =0;
        for(int i:arr)
        {
            if(i>h)ans+=2;
            else ans++;
        }
        System.out.println(ans);
    }
}
