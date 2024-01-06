import java.io.*;
import java.util.*;

public class ArithmeticArray {
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
            int n = Integer.parseInt(buf.readLine());
            int[]arr = getArray(new StringTokenizer(buf.readLine()),n);
            int sum=0;
            for(int i:arr)sum+=i;
            sum-=n;
            if(sum==0) System.out.println(0);
            else if(sum<0) System.out.println(1);
            else System.out.println(sum);
        }

    }
}
