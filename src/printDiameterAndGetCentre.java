import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class printDiameterAndGetCentre {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inp =new StringTokenizer(buf.readLine());
        int n = Integer.parseInt(inp.nextToken());
        int v = Integer.parseInt(inp.nextToken());
        HashMap<Integer, List<Integer>>hm =new HashMap<>();
        while(n-->0)
        {
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            int a = Integer.parseInt(ed.nextToken());
            int b = Integer.parseInt(ed.nextToken());
            hm.computeIfAbsent(a,k->new ArrayList<>()).add(b);
            hm.computeIfAbsent(b, k->new ArrayList<>()).add(a);
        }
        int []dis = new int[n+1];
        int[]parent =new int[n+1];
        dfs(hm,1,0,parent,dis,0);
        int max=0;
        for(int i=1;i<=n;i++)if(dis[max]>dis[i])max=i;
        dfs(hm,max,0,parent,dis,0);
        max=0;
        for(int i=1;i<=n;i++)if(dis[max]>dis[i])max=i;
        System.out.println(dis[max]);
        List<Integer>al = new ArrayList<>();
        while(max!=0)
        {
            al.add(max);
            max=parent[max];
        }
        System.out.println(al.size()-1);
        if((parent.length&1)==1) System.out.println(al.get(al.size()>>1));
        else {
            System.out.println("centre1"+" "+al.get(al.size()/2));
            System.out.println("centre2"+" "+al.get((al.size()-1)/2));
        }
    }
    static void dfs(HashMap<Integer,List<Integer>>hm,int node,int parent,int[]par,int[]dis ,int rdis)
    {
        par[node]=parent;
        dis[node]=rdis;
        for(int i:hm.getOrDefault(node,new ArrayList<>()))
        {
            if(i!=parent)
            {
                dfs(hm,i,node, par, dis, rdis+1);
            }
        }
    }
}