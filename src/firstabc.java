import java.io.*;
import java.util.*;

public class firstabc {
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
        int l =getSmallInt(buf.readLine());
        String s=buf.readLine();
        int[]fre= new int[26];
        for(int i =0;i<l;i++)
        {
            fre[s.charAt(i)-'a']++;
            if(fre[0]==1&&fre[1]==1&&fre[2]==1){
                System.out.println(i+1);
                return;
            }
        }
    }
}
