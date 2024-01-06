import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class CGR11 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-->0)
        {
            int n = Integer.parseInt(buf.readLine());
            StringTokenizer str = new StringTokenizer(buf.readLine());
            StringBuilder ans = new StringBuilder();
            Integer[]arr = new Integer[n];
            int sum=0;
            int neg=0;
            int pos=0;
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(str.nextToken());
                sum+=arr[i];
                if(arr[i]<0)neg+=Math.abs(arr[i]);
                else pos+=arr[i];
            }
            if(sum==0)
            {
                System.out.println("No");
                continue;
            }
            if(pos<neg)
            Arrays.sort(arr);
            else Arrays.sort(arr,(a,b)->Integer.compare(b,a));
            for(int i:arr)ans.append(i).append(" ");
            System.out.println("Yes");
            System.out.println(ans);
        }
    }
}
