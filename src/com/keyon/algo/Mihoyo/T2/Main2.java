package com.keyon.algo.Mihoyo.T2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int q = cin.nextInt();
        for (int i = 0; i < q; i++) {
            String oriStr = cin.next();
            String tarStr = cin.next();
            if (judge(oriStr, tarStr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean judge(String oriStr, String tarStr) {
        Map<Character, Integer> map1 = countMap(oriStr);
        Map<Character, Integer> map2 = countMap(tarStr);

        return true;
    }


    public static Map<String,Double> cutWeight(Map<String,Double> goldMap,Map<String,Double> preMap)
    {
        Map<String,Double> cutMap = new HashMap<String,Double>();
        for(String s : preMap.keySet())
        {
            if(goldMap.containsKey(s))
            {
                cutMap.put(s, (goldMap.get(s)-preMap.get(s)));

            } else
            {
                cutMap.put(s, -(preMap.get(s)));
            }
        }
        for(String str : goldMap.keySet())
        {
            if(!preMap.containsKey(str))
            {
                cutMap.put(str, goldMap.get(str));
            }
        }

        //删除值为空的项

        Iterator iterator = cutMap.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry mapEntry = (Map.Entry)iterator.next();

            Double value =(Double)mapEntry.getValue();

            if(value == 0.0)
            {
                iterator.remove();
            }

        }

        return cutMap;
    }

    private static Map<Character, Integer> countMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}
