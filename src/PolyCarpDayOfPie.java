import java.io.*;
import java.util.*;

public class PolyCarpDayOfPie {
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
        String gen ="314159265358979323846264338327";
        abhay:while (t-->0){
            String s = buf.readLine();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=gen.charAt(i)){
                    System.out.println(i);
                    continue abhay;
                }
            }
            System.out.println(s.length());
        }

    }
}
