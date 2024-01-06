
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BigBrother {
    static int getInput(StringTokenizer a)
    {
        return Integer.parseInt(a.nextToken());
    }
    static int[] getArray(StringTokenizer a,int l)
    {
        int[]arr = new int[l];
        for(int i=0;i< l;i++)arr[i]=Integer.parseInt(a.nextToken());
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int a =getInput(st);
        int b =getInput(st);
        int ans =0;
        while(a<=b)
        {
            a*=3;
            b*=2;
            ans++;
        }
        System.out.println(ans);
    }
}
