import java.io.*;
import java.util.*;

public class CollectingCoins {
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
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
            StringTokenizer st = new StringTokenizer(buf.readLine());
            long a =getInput(st);
            long b =getInput(st);
            long c =getInput(st);
            long d =getInput(st);
            long ans =a+b+c+d;
            long f=ans/3;
            if(ans%3==0&&a<=f&&b<=f&&c<=f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
