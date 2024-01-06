import java.io.*;
import java.util.*;

public class soldiersAndBanana {
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
        long k =getInput(st);
        long n =getInput(st);
        long w =getInput(st);
        long ans= (w*(w+1))>>1;
        ans*=k;
        ans-=n;
        ans=Math.max(ans,0);
        System.out.println(ans);
    }
}
