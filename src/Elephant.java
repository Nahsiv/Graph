import java.io.*;
import java.util.*;

public class Elephant {
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
        int a = Integer.parseInt(buf.readLine());
        int ans=0;
        for(int i=5;i>0;i--)
        {
            ans+=a/i;
            a%=i;
        }
        System.out.println(ans);
    }
}
