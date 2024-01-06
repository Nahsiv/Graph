import java.io.*;
import java.util.*;

public class Pedestal {
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
        while (t-->0){
            int n =Integer.parseInt(buf.readLine());
            int first= n/3;
            int second =n/3;
            int third =n/3;
            if(n%3==0)
            {
                first++;
                third--;
            }
            else if(n%3==1){
                first+=2;
                third--;
            }
            else{
                first+=2;
                second++;
                third--;
            }
            StringBuilder ans = new StringBuilder();
            ans.append(second).append(" ").append(first).append(" ").append(third);
            System.out.println(ans);
        }

    }
}
