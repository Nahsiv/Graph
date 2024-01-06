import java.io.*;
import java.util.*;

public class tenWordsOfWisdom {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }
    static int getSmallInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =getSmallInt(buf.readLine());
        while (t-->0){
            int len=getSmallInt(buf.readLine());
            int ans=-1;
            int cq=0;
            for(int i =0;i<len;i++)
            {
                int[]arr=getArray(new StringTokenizer(buf.readLine()),2);
                if(arr[0]<=10&&arr[1]>cq){
                    cq=arr[1];
                    ans=i+1;
                }
            }
            System.out.println(ans);
        }

    }
}
