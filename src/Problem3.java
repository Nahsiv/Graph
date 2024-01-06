import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem3 {
    //here comes the maze
    //you are given with the starting point and the ending point ,and you need to find out the SSSP here
    //also print the path that is taken to get the minimum distance
    static class Pair{
        int f;
        int s;
        Pair(int f,int s)
        {
            this.f=f;
            this.s=s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inp =new StringTokenizer(buf.readLine());
        int r = Integer.parseInt(inp.nextToken());
        int c = Integer.parseInt(inp.nextToken());
        char [][]arr =new char[r][c];
        for(int i=0;i<r;i++)
        {
            String s=buf.readLine();
            for(int j=0;j<c;j++)
            {
                arr[i][j]=s.charAt(j);
            }
        }
        StringTokenizer SP = new StringTokenizer(buf.readLine());
        Pair sp = new Pair(Integer.parseInt(SP.nextToken()),Integer.parseInt(SP.nextToken()));
        StringTokenizer EP = new StringTokenizer(buf.readLine());
        Pair ep = new Pair(Integer.parseInt(EP.nextToken()),Integer.parseInt(EP.nextToken()));
        Integer [][]dist = new Integer[r][c];
        Pair [][]pare = new Pair[r][c];
        bfs(dist,pare,sp,arr);
        System.out.println(dist[ep.f][ep.s]);
        print(ep,pare);
    }
    static void print(Pair t,Pair[][]pare)
    {
        if(t.f==-1&&t.s==-1)return;
        print(pare[t.f][t.s],pare);
        System.out.println(t.f+" "+t.s);
    }
    static boolean check(int x,int y,int r,int c,char[][]arr)
    {
        return (x>=0&&x<r)&&(y>=0&&y<c)&&arr[x][y]!='#';
    }
    static void bfs(Integer[][]dist,Pair[][]pare,Pair start,char[][]ch)
    {
        int r = dist.length;
        int c = dist[0].length;
        Queue<Pair>q =new LinkedList<>();
        int[]dx={1,0,-1,0};
        int[]dy={0,1,0,-1};
        dist[start.f][start.s]=0;
        q.add(start);
        pare[start.f][start.s]=new Pair(-1,-1);
        while(!q.isEmpty())
        {
            Pair temp = q.poll();
            for(int i=0;i<4;i++)
            {
                int X = temp.f+dx[i];
                int Y = temp.s+dy[i];
                if(check(X,Y,r,c,ch)&&dist[X][Y]==null)
                {
                    dist[X][Y]=1+dist[temp.f][temp.s];
                    pare[X][Y]=new Pair(temp.f, temp.s);
                    q.add(new Pair(X,Y));
                }
            }
        }
    }
}
