import java.io.*;
import java.util.*;

public class pAndSOS {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static long[] getArray(StringTokenizer a, int l) {
        long[] arr = new long[l];
        for (int i = 0; i < l; i++) arr[i] = Long.parseLong(a.nextToken());
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
        long[]arr =getArray(new StringTokenizer(buf.readLine()),7);
        System.out.println(arr[0]+" "+arr[1]+" "+(arr[6]-arr[0]-arr[1]));
        }
    }
}
