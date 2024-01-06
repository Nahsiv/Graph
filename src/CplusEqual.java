import java.io.*;
import java.util.*;

public class CplusEqual {
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
            StringTokenizer st = new StringTokenizer(buf.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a>c||b>c){
                System.out.println(0);continue;
            }
            if(a>b)
            {
                int temp=a;
                a=b;
                b=temp;
            }
            int ans=0;
            boolean x =true;
            while(true)
            {
                if(x)a+=b;
                else b+=a;
                x=!x;
                ans++;
//                System.out.println(a+" "+b);
                if(a>c||b>c){
                    System.out.println(ans);break;
                }
            }

        }

    }
}
