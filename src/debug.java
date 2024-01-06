import java.io.*;
import java.util.*;

public class debug {
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
        int[]nums={2,6,1,9};
        int x=5;
        long ans=findSum(nums,nums[0]%2,0,1,x);
        long ans1=findSum(nums,nums[0]%2,1,1,x);
        System.out.println(ans+" "+ans1);
    }
    static long findSum(int[]nums,int cp,int tak, int i,int x){
        if(i==nums.length)return 0;
        int np=nums[i]%2;
        if(tak==0){
            return Math.max(findSum(nums,cp,tak,i+1,x),findSum(nums,cp,1,i+1,x));
        }
        else{
            if(cp==np){
                return Math.max(findSum(nums,cp,tak,i+1,x),findSum(nums,cp,0,i+1,x))+nums[i];
            }
            else {
                return Math.max(findSum(nums,np,tak,i+1,x),findSum(nums,np,0,i+1,x))-x;
            }
        }
    }
}
