import java.io.*;
import java.util.*;

public class QAQ {
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
        String s = buf.readLine();
        int[]qs = new int[s.length()];
        int[]qe = new int[s.length()];
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='Q')qs[i]++;
            if(i>0)qs[i]+=qs[i-1];
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='Q')qe[i]++;
            if(i<s.length()-1)qe[i]+=qe[i+1];
        }
//        System.out.println(Arrays.toString(qs));
//        System.out.println(Arrays.toString(qe));
        int ans=0;
        for(int i =1;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='A')ans+=qs[i]*qe[i];
        }
        System.out.println(ans);
    }
}
