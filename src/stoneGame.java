import java.io.*;
import java.util.*;

public class stoneGame {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }
    static int getMin(int[]arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)if(arr[i]<arr[ans])ans=i;
        return ans;
    }
    static int getMax(int[]arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)if(arr[i]>arr[ans])ans=i;
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0){
            int l = Integer.parseInt(buf.readLine());
            int[]arr=getArray(new StringTokenizer(buf.readLine()),l);
            int[]ind = new int[2];
            ind[0]=getMax(arr);
            ind[1]=getMin(arr);
            Arrays.sort(ind);
//            System.out.println(Arrays.toString(ind));
            int ans =Math.min(ind[1]+1,arr.length-ind[0]);
            ans=Math.min(ans,ind[0]+1+arr.length-ind[1]);
            System.out.println(ans);
        }

    }
}
