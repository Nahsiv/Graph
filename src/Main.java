//Har Har Mahadev
//Om Namah Shivay
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        StringTokenizer ar = new StringTokenizer(buf.readLine());
        int num =(int)1e9;
        while(ar.hasMoreTokens())num=Math.min(num,Integer.parseInt(ar.nextToken()));
        int ans =p-Math.max(0,-num+q);
        System.out.println(ans);
    }
}