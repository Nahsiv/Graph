import java.io.*;
import java.util.*;

public class ErasingZeroes {
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
        int t =Integer.parseInt(buf.readLine());
        while(t-->0){
            String s =buf.readLine();
            int i=0;
            int j=s.length()-1;
            while(i<s.length()&&s.charAt(i)=='0')i++;
            while(j>=0&&s.charAt(j)=='0')j--;
            int ans=0;
//            int curr=0;
            for(int k=i;k<=j;k++)
            {
                int v=s.charAt(k)-'0';
                if(v==0)
                {
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }
}
