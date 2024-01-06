import java.io.*;
import java.util.*;

public class jugglinhLetter {
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
        abhay:while (t-->0){
            int l = Integer.parseInt(buf.readLine());
            int p=l;
            int[]fre = new int[26];
            while (l-->0){
                String s=buf.readLine();
                for(char ch:s.toCharArray())fre[ch-'a']++;
            }
            for(int i:fre){
                if(i%p!=0){
                    System.out.println("NO");
                    continue abhay;
                }
            }
            System.out.println("YES");
        }

    }
}
