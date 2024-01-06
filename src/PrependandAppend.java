import java.io.*;
import java.util.*;

public class PrependandAppend {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }
    static boolean areXor(int a,int b)
    {
        return (a^b)==1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(buf.readLine());
        while (t-->0){
            int len =Integer.parseInt(buf.readLine());
            String s =buf.readLine();
            int i=0;
            int j=s.length()-1;
            while (i<j&&areXor(s.charAt(i)-'0',s.charAt(j)-'0')){
                i++;
                j--;
            }
            System.out.println(j-i+1);
        }

    }
}
