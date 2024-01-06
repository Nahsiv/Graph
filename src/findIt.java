import java.io.*;
import java.util.*;

public class findIt {
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
        int n =Integer.parseInt(buf.readLine());
        int[]arr =getArray(new StringTokenizer(buf.readLine()),n);
        boolean[]vis = new boolean[n];
        StringBuilder ans = new StringBuilder();
        List<Integer>an= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(vis[arr[i]-1])continue;
            StringBuilder curr = new StringBuilder();
            HashSet<Integer>hs = new HashSet<>();
            int r =arr[i];
            while(!hs.contains(r)){
                vis[r-1]=true;
                hs.add(r);
                r=arr[r-1];
            }
            an.add(r);
        }
        for(int i:an){
            int p=i;
            StringBuilder temp = new StringBuilder();
            do{
                temp.append(p).append(" ");
                p=arr[p-1];
            }
            while(p!=i);
            if(ans.length()<temp.length())ans = new StringBuilder(temp);
        }
        System.out.println(ans.length()/2);
        System.out.println(ans);
    }
}
