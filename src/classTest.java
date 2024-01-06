import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class classTest {
    static void swap(int[]arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[]arr)
    {
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            swap(arr,l,r);

            l++;
            r--;
        }
    }
    static int[] ps(int[]arr)
    {
        Deque<Integer> dq = new LinkedList<>();
        int []ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!dq.isEmpty()&&arr[dq.peekLast()]>=arr[i])dq.pollLast();
            if(dq.isEmpty())ans[i]=-1;
            else
            ans[i]=dq.peekLast();
            dq.addLast(i);
        }
        return ans;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(buf.readLine());
        while(tc-->0)
        {
            int len = Integer.parseInt(buf.readLine());
            StringTokenizer ar = new StringTokenizer(buf.readLine());
            int[]arr = new int[len];
            for(int i=0;i<len;i++)arr[i]=Integer.parseInt(ar.nextToken());
            //previous smaller element
            int []ps = ps(arr);
            reverse(arr);
            int []ns = ps(arr);
            reverse(ns);
            for(int i=0;i<ns.length;i++)
            {
                if(ns[i]!=-1)ns[i]=ns.length-1-ns[i];
            }
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<len;i++)
            {
                if(ps[i]==-1||ns[i]==-1)ans.append(-1).append(" ");
                else {
                    int r= i-ps[i]-1;
                    r+=ns[i]-i-1;
                    ans.append(r).append(" ");
                }
            }
            System.out.println(ans);
        }
    }
}
