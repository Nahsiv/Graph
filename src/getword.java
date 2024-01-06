import java.io.*;
import java.util.*;

public class getword {
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
        int t=getSmallInt(buf.readLine());
        while (t-->0){
            char[][]ch = new char[8][8];
            boolean ans=true;
            int r=-1;
            int c=-1;
            for(int i=0;i<8;i++)
            {
                ch[i]=buf.readLine().toCharArray();
                for(int j=0;j<8;j++)
                {
                    if(ans&& Character.isLowerCase(ch[i][j])){
                        r=i;
                        c=j;
                        ans=false;
                    }
                }
            }
//            System.out.println(Arrays.deepToString(ch));;
            StringBuilder an = new StringBuilder();
            for(int i=r,j=c;i<8&&j<8&&ch[i][j]!='.';i++)an.append(ch[i][j]);
            System.out.println(an);

        }

    }
}
