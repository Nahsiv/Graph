import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class centroidOfTree {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());
        n =Integer.parseInt(st.nextToken());
//        this.n=n;
        int v = Integer.parseInt(st.nextToken());
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        while (v-->0){
            StringTokenizer ed = new StringTokenizer(buf.readLine());
            int a=Integer.parseInt(ed.nextToken());
            int b=Integer.parseInt(ed.nextToken());
            hm.computeIfAbsent(a, k->new ArrayList<>()).add(b);
            hm.computeIfAbsent(b,k->new ArrayList<>()).add(a);
        }
        //It is for sure that we have total n number of nodes in a tree
        List<Integer>ans = new ArrayList<>();
        int[]size =new int[n+1];
        dfs(hm,1,0,size,ans);
        System.out.println(ans);

    }
    static void dfs(HashMap<Integer,List<Integer>>hm,int node,int parent,int[]size,List<Integer>ans)
    {
        size[node]=1;
        boolean isCentroid =true;
        for(int i:hm.getOrDefault(node,new ArrayList<>()))
        {
            if(i!=parent)
            {
                dfs(hm,i,node,size,ans);
                size[node]+=size[i];
                if(2*size[i]>n)isCentroid=false;
            }
        }
        //now check for the centroid and insert it into the answer
        if(2*(n-size[node])>n)isCentroid=false;
        if(isCentroid)ans.add(node);
    }
}
