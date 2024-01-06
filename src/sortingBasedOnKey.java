//import java.util.*;
//
//class treeMap {
//    public static void main(String[] args) {
//        System.out.println("the main");
//        byValue cmp = new byValue();
//        Map<String, int[]> map = new TreeMap<String, Integer>(cmp);
//        map.put("de",new int[]{10});
//        map.put("ab", new int[]{20});
//        map.put("a",new int[]{30});
//
//        for (Map.Entry<String,int[]> pair: map.entrySet()) {
//            System.out.println(pair.getKey()+":"+Arrays.toString(pair.getValue()));
//        }
//    }
//}
//
//class byValue implements Comparator<Map.Entry<String,int[]>> {
//    public int compare(Map.Entry<String,int[]> e1, Map.Entry<String,int[]> e2) {
//        return Integer.compare(e1.getValue()[0],e2.getValue()[0]);
//    }
//}

import java.util.*;

class treeMap {
    public static void main(String[] args) {
        TreeMap<Long,Integer>tm1 = new TreeMap<Long,Integer>(new Comparator<Long>(){
            @Override
            public int compare(Long o1, Long o2) {
                return 0;
            }
        });
        System.out.println("the main");
        byValue cmp = new byValue();
//        Map<String, Integer> map = new TreeMap<String, Integer>(cmp);
        TreeSet<Map.Entry<Integer, int[]>> map = new TreeSet<>(new Comparator<Map.Entry<Integer, int[]>>()
        {
            @Override
            public int compare(Map.Entry<Integer, int[]> o1, Map.Entry<Integer, int[]> o2)
            {
                return Integer.compare(o1.getValue()[0],o2.getValue()[0]);
            }
        });
        int key = 5;
        int[]value={1};
        map.add(new AbstractMap.SimpleEntry<>(key, value));
        key = 3;
        value=new int[]{2};
        map.add(new AbstractMap.SimpleEntry<>(key, value));
        key = 1;
        value=new int[]{10};
        map.add(new AbstractMap.SimpleEntry<>(key, value));
        map.add(new AbstractMap.SimpleEntry<>(3,new int[]{10}));

//        map.put("ab", new int[]{20});
//        map.put("a",new int[]{30});
//
//        for (Map.Entry<Integer,int[]> pair: map.e) {
//            System.out.println(pair.getKey()+":"+Arrays.toString(pair.getValue()));
//        }
    }
    }

class byValue implements Comparator<Map.Entry<String,Integer>> {
    public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
        if (e1.getValue() < e2.getValue()){
            return 1;
        } else if (e1.getValue() == e2.getValue()) {
            return 0;
        } else {
            return -1;
        }
    }
}