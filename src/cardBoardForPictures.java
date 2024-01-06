import java.io.*;
import java.util.*;

public class cardBoardForPictures{
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
    static long gotta(int[]arr,int num)
    {
        long ans=0;
        for(long i:arr)ans+=(i+num)*(i+num);
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t=getSmallInt(buf.readLine());
        abhay:while (t-->0){
            StringTokenizer st = new StringTokenizer(buf.readLine());
            int l = getInput(st);
            long c = Long.parseLong(st.nextToken());
            int []arr =getArray(new StringTokenizer(buf.readLine()),l);
            int left=0;
            int right=100;
            while(left<=right) {
                int mid = left + (right - left) >> 1;
                long ans = gotta(arr, mid);
                if (ans == c) {
                    System.out.println(mid);
                    continue abhay;
                } else if (ans < c) left = mid + 1;
                else right = mid - 1;
            }
        }

    }
}
