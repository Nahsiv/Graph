import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class CountTheNumberOfDiameter {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inp =new StringTokenizer(buf.readLine());
        int n = Integer.parseInt(inp.nextToken());
        int v =Integer.parseInt(inp.nextToken());
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        while (v-->0){
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            int a  = Integer.parseInt(ed.nextToken());
            int b = Integer.parseInt(ed.nextToken());
            hm.computeIfAbsent(a, k->new ArrayList<>()).add(b);
            hm.computeIfAbsent(b, k->new ArrayList<>()).add(a);
        }
        int[]dis =new int[n+1];
        int[]parent=new int[n+1];
        dfs(hm,1,0,dis,0,parent);
        int max=0;
        for(int i=1;i<=n;i++)if(dis[max]<dis[i])max=i;
        dfs(hm,max,0,dis,0,parent);
        max=0;
        for(int i=1;i<=n;i++)if(dis[max]<dis[i])max=i;
        List<Integer>diam = new ArrayList<>();
        while(max!=0){
            diam.add(max);
            max=parent[max];
        }
        System.out.println("Diameter is"+(diam.size()-1));
        if((diam.size()&1)==1)
        {
            //to change the max as the center
            max=diam.get(diam.size()/2);
            //get all the total farthest
            List<Integer>ans = new ArrayList<>();
            for(int i:hm.get(max))
            {
                dfs(hm,i,max,dis,0,parent);
                int sum=0;
                int distance=diam.size()/2-1;
                for(int i1=1;i1<=n;i1++)
                {
                    if(dis[i1]==distance)sum++;
                }
                ans.add(sum);
            }
            long rans=ans.get(0);
            long csum=0;
            for(int i:ans)
            {
                rans+=csum*i;
                csum+=i;
            }
            System.out.println(rans);
        }
        else{
            //this is the case for the two diameter
            int centre1 =diam.get(diam.size()/2);
            int centre2 = diam.get((diam.size()-1)/2);
            dfs(hm,centre1,centre2,dis,0,parent);
            int sum=0;
            int distance=diam.size()/2;
            for(int i1=1;i1<=n;i1++)
            {
                if(dis[i1]==distance)sum++;
            }
            long rans =sum;
            dfs(hm,centre2,centre1,dis,0,parent);
            sum=0;
            for(int i1=1;i1<=n;i1++)
            {
                if(dis[i1]==distance)sum++;
            }
            rans*=sum;
            System.out.println(rans);
        }

    }
    static void dfs(HashMap<Integer,List<Integer>>hm, int node, int parent,int[]dis,int distance,int[]paren)
    {
        paren[node]=parent;
        dis[node]=distance;
        for (int i:hm.getOrDefault(node,new ArrayList<>()))
        {
            if(i!=parent)
            dfs(hm,i,node,dis,distance+1,paren);
        }
    }
}
