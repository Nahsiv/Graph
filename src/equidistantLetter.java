import java.io.*;
import java.util.*;

public class equidistantLetter {
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
        while (t-->0){
            String s =buf.readLine();
            int[]fre= new int[26];
            for(char ch:s.toCharArray())fre[ch-'a']++;
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<26;i++)
            {
                char ch=(char)('a'+i);
                if(fre[i]==2)ans.append(ch).append(ch);
                else if(fre[i]==1)ans.append(ch);
            }
            System.out.println(ans);
        }

    }
}
