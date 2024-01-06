import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kKahns_Algorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer inp =new StringTokenizer(buf.readLine());
        int n = Integer.parseInt(inp.nextToken());
        int v = Integer.parseInt(inp.nextToken());;
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        int[]ind= new int[n];
        while (v-->0)
        {
            StringTokenizer ed =new StringTokenizer(buf.readLine());
            int a =Integer.parseInt(ed.nextToken());
            int b =Integer.parseInt(ed.nextToken());
            hm.get(a).add(b);
            ind[b]++;
        }
        Queue<Integer>q =new LinkedList<>();
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i< ind.length;i++)if(ind[i]==0)q.add(i);
        while(!q.isEmpty())
        {
            int t=q.poll();
            ans.add(t);
            for(int i:hm.getOrDefault(t, new ArrayList<>()))
            {
                ind[i]--;
                if(ind[i]==0)q.add(i);
            }
        }
        System.out.println(ans);
    }
}
