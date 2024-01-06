import java.io.*;
import java.util.*;

public class WrongSubtraction {
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
        int k =getInput(st);
        while (k>0)
        {
            if(n%10==0){
                k--;
                n/=10;
            }
            else {
                int min=Math.min(k,n%10);
                n-=min;
                k-=min;
            }
        }
        System.out.println(n);
    }
}
