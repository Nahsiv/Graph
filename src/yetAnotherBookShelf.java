import java.io.*;
import java.util.*;

public class yetAnotherBookShelf {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }

    static int getSmallInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-->0){
            int l = Integer.parseInt(buf.readLine());
            int[]arr = getArray(new StringTokenizer(buf.readLine()),l);
            int i=0;
            int j=l-1;
            while(i<l&&arr[i]==0)i++;
            while(j>=0&&arr[j]==0)j--;
            int ans=0;
            for(int k = i;k<=j;k++){
                ans+=1^arr[k];
            }
            System.out.println(ans);
        }
    }

}
