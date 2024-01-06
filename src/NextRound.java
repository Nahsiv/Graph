import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        StringTokenizer str = new StringTokenizer(buf.readLine());
        int[]arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str.nextToken());
        }
        int ans = arr[k-1];
        int rans=0;
        for(int i:arr)
        {
            if(i>=ans&&i!=0)rans++;
        }
        System.out.println(rans);
    }
}
