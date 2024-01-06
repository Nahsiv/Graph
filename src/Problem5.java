import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inp =new StringTokenizer(buf.readLine());
        int n = Integer.parseInt(inp.nextToken());
        int m = Integer.parseInt(inp.nextToken());
        HashMap<Integer, List<Integer>>hm = new HashMap<>();
        while (m-->0)
        {
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            int a =Integer.parseInt(ed.nextToken());
            int b =Integer.parseInt(ed.nextToken());
            hm.computeIfAbsent(a,k->new ArrayList<>()).add(b);
            hm.computeIfAbsent(b,k->new ArrayList<>()).add(a);
        }
        int[]size = new int[n+1];
        dfs(hm,1,0,size);
        System.out.println(ans);
    }
    static long ans =0;
    static void dfs(HashMap<Integer,List<Integer>>hm ,int node,int parent,int []size)
    {
        size[node]=1;
        for(int i:hm.getOrDefault(node,new ArrayList<>()))
        {
            if(i!=parent)
            {
                dfs(hm,i,node,size);
                size[node]+=size[i];
            }
        }
        ans+=size[node]*(size.length-1-size[node]);
    }
}
