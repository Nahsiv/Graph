import java.io.*;
import java.util.*;

public class toMyCities {
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
            int[]arr =getArray(new StringTokenizer(buf.readLine()),3);
            Arrays.sort(arr);
            String s=arr[1]+arr[2]>=10?"YES":"NO";
            System.out.println(s);
        }

    }
}
