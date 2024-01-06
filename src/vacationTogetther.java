import java.io.*;
import java.util.*;

public class vacationTogetther {
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
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int n=getInput(st);
        int m=getInput(st);
        String[]arr=new String[n];
        for(int i=0;i<n;i++)arr[i]=buf.readLine();
        int[]ka = new int[m];
        for(int i=0;i<m;i++)
        {
            boolean b =true;
            for(int j=0;j<n;j++)
            {
                if(arr[j].charAt(i)=='x')b=false;
            }
            if(b)ka[i]=1;
        }
        int ans=0;
        int curr=0;
        for(int i:ka){
            if(i==0){
                curr=0;
            }
            else curr++;
            ans=Math.max(ans,curr);
        }
        System.out.println(ans);
    }
}
