import java.io.*;
import java.util.*;

public class LinearKeyBoard {
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
            String a = buf.readLine();
            String b = buf.readLine();
            HashMap<Character,Integer>hm = new HashMap<>();
            for(int i=0;i<a.length();i++)hm.put(a.charAt(i), i);
            int ans =0;
            for(int i =1;i<b.length();i++)
            {
                ans+=Math.abs(hm.get(b.charAt(i))-hm.get(b.charAt(i-1)));
//                System.out.print(ans+" ");
            }
            System.out.println(ans);
        }

    }
}
