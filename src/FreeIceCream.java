import java.io.*;
import java.util.*;

public class FreeIceCream {
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
        long k = getInput(st);
        int dif=0;
        while (n-->0){
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            char ch =ed.nextToken().charAt(0);
            int r=getInput(ed);
            if(ch=='+')k+=r;
            else {
                if(k<r)dif++;
                else k-=r;
            }
        }
        System.out.println(k+" "+dif);
    }
}
