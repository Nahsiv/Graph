import java.io.*;
import java.util.*;

public class allDistinct {
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
            int l = Integer.parseInt(buf.readLine());
            int[]arr =getArray(new StringTokenizer(buf.readLine()),l);
            HashMap<Integer,Integer>hm = new HashMap<>();
            for(int i:arr)hm.put(i,hm.getOrDefault(i,0)+1);
            int ans=0;
            for(int i:hm.values()){
                ans+=i;
            }
            if(((ans-hm.size())&1)==0) System.out.println(hm.size());
            else System.out.println(hm.size()-1);
        }

    }
}
