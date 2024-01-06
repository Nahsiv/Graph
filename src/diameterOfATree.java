import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class diameterOfATree {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        HashMap<Integer, List<Integer>>hm =new HashMap<>();
        while(v-->0)
        {
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            int a = Integer.parseInt(ed.nextToken());
            int b = Integer.parseInt(ed.nextToken());
            hm.computeIfAbsent(a,k->new ArrayList<>()).add(b);
            hm.computeIfAbsent(b, k->new ArrayList<>()).add(a);
        }
        //take the random node and get the farthest node
        int[]dis = new int[n+1];
        dfs(hm,1,0,dis,0);
        int ans = 0;
        for(int i=1;i<=n;i++)if(dis[ans]<dis[i])ans=i;
        dfs(hm,ans,0,dis,0);
        //Answer is considered to be as one end point of the diameter
        ans=0;
        for(int i=1;i<=n;i++)if(dis[ans]<dis[i])ans=i;
        System.out.println(dis[ans]);
    }
    static void dfs(HashMap<Integer,List<Integer>>hm ,int node,int parent,int []dis,int val)
    {
        dis[node]=val;
        for(int i:hm.getOrDefault(node,new ArrayList<>())){
            if(i!=parent)
            {
                dfs(hm,i,node,dis,val+1);
            }
        }
    }
}
