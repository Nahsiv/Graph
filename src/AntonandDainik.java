import java.io.*;
import java.util.*;

public class AntonandDainik {
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
        String s = buf.readLine();
        int[]arr = new int[4];
        for(char ch:s.toCharArray())
            arr[ch-'A']++;
//        System.out.println(Arrays.toString(arr));
        if(arr[0]>arr[3]) System.out.println("Anton");
        else if(arr[0]==arr[3]) System.out.println("Friendship");
        else System.out.println("Danik");
    }
}
