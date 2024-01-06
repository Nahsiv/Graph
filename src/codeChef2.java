import java.io.*;
import java.util.*;

public class codeChef2 {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }
    static int getTc(String s)
    {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =getTc(buf.readLine());
        while (t-->0){
            int l=getTc(buf.readLine());
            int[]arr=getArray(new StringTokenizer(buf.readLine()),l);

        }

    }
}
