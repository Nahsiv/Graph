import java.io.*;
import java.util.*;

public class cipherCipher {
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
            int l =Integer.parseInt(buf.readLine());
            String s = buf.readLine();
            int last=-1;
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(last==-1)
                {
                    ans.append(s.charAt(i));
                    last=i;
                }
                else if(s.charAt(i)==s.charAt(last))
                {
                    last=-1;
                }
            }
            System.out.println(ans);
        }

    }
}
