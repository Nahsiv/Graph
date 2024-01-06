import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ComputerGame {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        abhay:while (t-->0){
            int l = Integer.parseInt(buf.readLine());
            String s1 =buf.readLine();
            String t1 =buf.readLine();
            int[][]arr = new int[2][s1.length()];
            for(int i =0;i<s1.length();i++)
            {
                arr[0][i]=s1.charAt(i)-'0';
                arr[1][i]=t1.charAt(i)-'0';
            }

            Queue<int[]> q = new LinkedList<>();
            if(s1.charAt(0)=='1'){
                System.out.println("NO");
                continue;
            }
            q.add(new int[]{0,0});
            arr[0][0]=1;
            int[]dx={-1,-1,-1,0,0,1,1,1};
            int[]dy={-1,0,1,-1,1,-1,0,1};
//            System.out.println(Arrays.deepToString(arr));
            while(!q.isEmpty())
            {
                int []temp=q.poll();
                if(temp[0]==1&&temp[1]==s1.length()-1){
                    System.out.println("YES");
                    continue abhay;
                }
                for(int i=0;i<8;i++) {
                    int nx = temp[0] + dx[i];
                    int ny = temp[1] + dy[i];
                    if (nx < 0 || ny >= s1.length() || nx >= 2 || ny < 0 || arr[nx][ny] == 1) continue;
                    q.add(new int[]{nx, ny});
                    arr[nx][ny] = 1;
                }
//                for(int[]k:q) System.out.print(Arrays.toString(k)+" ");
//                System.out.println();
//                System.out.println(q);
            }
            System.out.println("NO");
        }
    }
}
