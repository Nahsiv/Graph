import java.io.*;
import java.util.*;

public class copyCopy {
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
            int l =Integer.parseInt(buf.readLine());
            int[]arr=getArray(new StringTokenizer(buf.readLine()),l);
            HashSet<Integer>hs = new HashSet<>();
            for(int i:arr)hs.add(i);
            System.out.println(hs.size());
        }

    }
}
