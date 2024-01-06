import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class topologicalOrderingUsingDFS {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inp =new StringTokenizer(buf.readLine());
        int n =Integer.parseInt(inp.nextToken());
        int v=Integer.parseInt(inp.nextToken());
        HashMap<Integer, List<Integer>>hm =new HashMap<>();
        while(v-->0) {
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            int a = Integer.parseInt(ed.nextToken());
            int b = Integer.parseInt(ed.nextToken());
            hm.putIfAbsent(a, new ArrayList<>());
            hm.get(a).add(b);
        }
        boolean[]vis = new boolean[n];
        List<Integer>top=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfs(hm,i,top,vis);
            }
        }
        reverse(top);
        System.out.println(top);
    }
    static void dfs(HashMap<Integer,List<Integer>>hm , int node,List<Integer>top,boolean[]vis)
    {
        vis[node]=true;
        for(int i:hm.getOrDefault(node,new ArrayList<>())){
            if(!vis[i])
            {
                dfs(hm,i,top,vis);
            }
        }
        top.add(node);
    }
    static void reverse(List<Integer>al)
    {
        int i=0;
        int j=al.size()-1;
        while(i<j)
        {
            int a =al.get(i);
            al.set(i,al.get(j));
            al.set(j,a);
            i++;
            j--;
        }
    }
}
