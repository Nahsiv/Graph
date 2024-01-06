import java.io.*;
import java.util.*;

public class yert {
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
        int[]nums={1,3,5,4,7};
                int[]dp = new int[nums.length];
                int[]numbers = new int[nums.length];
                int max=1;
                int ans=1;
                numbers[0]=1;
                for(int i =0;i<nums.length;i++)
                {
                    dp[i]=1;
                     numbers[i]=1;
                    // numbers[0]=1;
                    for(int j=0;j<i;j++)
                    {
                        // dp[i]=1;
                        // numbers[i]=1;
                        if(nums[i]>nums[j]&&dp[i]<1+dp[j]){
                            dp[i]=1+dp[j];
                            numbers[i]=numbers[j];
                        }
                        if(dp[i]==dp[j])numbers[i]++;
                    }
                    if(dp[i]>max){
                        ans=numbers[i];
                    }
                    else if(dp[i]==max){
                        ans=Math.max(ans,numbers[i]);
                    }
                    max=Math.max(max,dp[i]);
//                    System.out.println(i+" "+Arrays.toString(dp));
//                    System.out.println(i+" "+Arrays.toString(numbers));
                }
                System.out.println(max);
                System.out.println(Arrays.toString(dp));
                System.out.println(Arrays.toString(numbers));
                System.out.println(ans);

    }
}
