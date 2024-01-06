import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CR7B {
    static void swap(int[]arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-->0)
        {
            int n = Integer.parseInt(buf.readLine());
            StringTokenizer str = new StringTokenizer(buf.readLine());
            if(n==1){
                System.out.println(-1);
                continue;
            }
            int[]arr = new int[n];
            PriorityQueue<Integer>pq = new PriorityQueue<>();
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(str.nextToken());
                pq.add(arr[i]);
            }
            int[]ans = new int[n];
            for(int i=0;i<n-1;i++)
            {
                int temp =pq.poll();
                if(temp!=arr[i])ans[i]=temp;
                else
                {
                        int temp1=pq.poll();
                        ans[i]=temp1;
                        pq.add(temp);
                }
            }
//            System.out.println(Arrays.toString(ans));
            int r = pq.poll();
            ans[n-1]=r;
            if(arr[n-1]==r)swap(ans,n-1,n-2);
            StringBuilder sb = new StringBuilder();
            for(int i:ans)sb.append(i).append(" ");
            System.out.println(sb);
        }
    }
}
