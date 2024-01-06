import java.io.*;
import java.util.*;

public class LoveStory {
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
        int t =Integer.parseInt(buf.readLine());
        String gen ="codeforces";
        while (t-->0){
            String s =buf.readLine();
            int ans=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=gen.charAt(i))ans++;
            }
            System.out.println(ans);
        }

    }
}
