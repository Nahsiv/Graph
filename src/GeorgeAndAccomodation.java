import java.io.*;
import java.util.*;

public class GeorgeAndAccomodation {
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
        int ans=0;
        while (t-->0)
        {
            StringTokenizer st = new StringTokenizer(buf.readLine());
            int a =getInput(st);
            int b=getInput(st);
            if(b-a>=2)ans++;
        }
        System.out.println(ans);
    }
}
