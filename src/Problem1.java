import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1 {
    static void dfs(HashMap<Integer,List<Integer>>hm,int component,int node,int[]vis)
    {
        vis[node]=component;
        for(int i:hm.getOrDefault(node,new ArrayList<>()))
        {
            if(vis[i]==0)
            {
                dfs(hm,component,i,vis);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
        int _t=Integer.parseInt(buf.readLine());
        while(_t-->0)
        {
            StringTokenizer gr=new StringTokenizer(buf.readLine());
            int n=Integer.parseInt(gr.nextToken());
            int v=Integer.parseInt(gr.nextToken());
            int[]vis =new int[n+1];
            HashMap<Integer,List<Integer>>hm =new HashMap<>();
            while(v-->0)
            {
                StringTokenizer ed =new StringTokenizer(buf.readLine());
                int i=Integer.parseInt(ed.nextToken());
                int j=Integer.parseInt(ed.nextToken());
                hm.putIfAbsent(i,new ArrayList<>());
                hm.putIfAbsent(j,new ArrayList<>());
                hm.get(i).add(j);
                hm.get(j).add(i);
            }
            int comCount=0;
            for(int i=1;i<=n;i++)
            {
                if(vis[i]==0)
                {
                    dfs(hm,++comCount,i,vis);
                }
            }
            int[]component=new int[comCount+1];
            for(int i=1;i<vis.length;i++)component[vis[i]]++;
            long ans =0;
            long pref=0;
            System.out.println(Arrays.toString(component));
            for(int i:component){
                ans+=pref*i;
                pref+=i;
            }
            System.out.println(ans);
        }
    }
}
