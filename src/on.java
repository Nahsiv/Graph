import java.io.*;
import java.util.*;

public class on {
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
       String []arr={ "ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"};
       HashSet<int[]>hs = new HashSet<>();
       hs.add(new int[]{1,2});
        System.out.println(hs.contains(new int[]{1,2}));
//       HashSet<String>hs = new HashSet<>();
//       for(String k:arr)hs.add(k);
//       String s = buf.readLine();
//        System.out.println(hs.contains(s)?"Yes":"No");
    }



}
