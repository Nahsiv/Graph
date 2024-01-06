import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Problem2 {
    static boolean isBipartite(HashMap<Integer,List<Integer>>hm,int node,int col,int[]color)
    {
        color[node]=col;
        for(int i:hm.getOrDefault(node,new ArrayList<>()))
        {
            if(color[i]==0)
            {
                isBipartite(hm,i,col^3,color);
            }
            else if(color[i]==color[node])return false;
        }
        return true;
    }
    //In a class of N people you know which pair are friends is there a way to divide the student in 2 sections in such a way that
    //that no two friends are in the same class
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NE = new StringTokenizer(buf.readLine());
        int n=Integer.parseInt(NE.nextToken());
        int e=Integer.parseInt(NE.nextToken());
        HashMap<Integer, List<Integer>>hm =new HashMap<>();
        while(e-->0){
            StringTokenizer IJ =new StringTokenizer(buf.readLine());
            int i=Integer.parseInt(IJ.nextToken());
            int j=Integer.parseInt(IJ.nextToken());
            hm.putIfAbsent(i,new ArrayList<>());
            hm.putIfAbsent(j,new ArrayList<>());
            hm.get(i).add(j);
            hm.get(j).add(i);
        }
        for(int node=1;node<=n;node++)
        {
            if(!isBipartite(hm,node,1,new int[n+1]))
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
