import java.io.*;
import java.util.*;

public class fileName {
    static int getInput(StringTokenizer a) {
        return Integer.parseInt(a.nextToken());
    }

    static int[] getArray(StringTokenizer a, int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) arr[i] = Integer.parseInt(a.nextToken());
        return arr;
    }
    static boolean allequal(StringBuilder ch,int i){
        if(ch.charAt(i)=='x'&&ch.charAt(i)==ch.charAt(i+1)&&ch.charAt(i+1)==ch.charAt(i+2))return true;
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(buf.readLine());
        StringBuilder ans = new StringBuilder(buf.readLine());
        boolean b=true;
       abhay: while(b){
        for(int i=0;i<ans.length()-2;i++)
        {
            if(allequal(ans,i)){
                ans.deleteCharAt(i);
                continue abhay;
            }
        }
        b=false;
        }
        System.out.println(t-ans.length());

    }
}
