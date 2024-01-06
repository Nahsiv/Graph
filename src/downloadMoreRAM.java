import java.io.*;
import java.util.*;

public class downloadMoreRAM {
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
        abhay:while(t-->0){
            StringTokenizer st = new StringTokenizer(buf.readLine());
            int n =Integer.parseInt(st.nextToken());
            int k =Integer.parseInt(st.nextToken());
            int[]a=getArray(new StringTokenizer(buf.readLine()),n);
            int[]b=getArray(new StringTokenizer(buf.readLine()),n);
            int[][]arr = new int[n][2];
            for(int i=0;i<n;i++)
            {
                arr[i][0]=a[i];
                arr[i][1]=b[i];
            }
            Arrays.sort(arr, Comparator.comparingInt(a2 -> a2[0]));
//            System.out.println(Arrays.deepToString(arr));
            for(int []k1:arr){
                if(k>=k1[0])k+=k1[1];
                else{
                    System.out.println(k);
                    continue abhay;
                }
            }
            System.out.println(k);
        }

    }
}
