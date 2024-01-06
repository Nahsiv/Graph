import java.io.*;
import java.util.*;

public class InsearchOfEasyProblem {
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
        int []arr = getArray(new StringTokenizer(buf.readLine()),t);
        boolean hard=false;
        for(int i:arr)if(i==1){
            hard=true;
            break;
        }
        if(hard) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
