import java.util.HashMap;

import java.util.*;
public class FirstHashMap
{
    public static void main(String args[])
    {    
        //1.We are creating a hashmap 
        HashMap<String,Integer> hm=new HashMap<>();

        //2.We are using the put() function to put values in the hashmap 
        hm.put("India",130);
        hm.put("China",200);
        hm.put("USA",329);
        hm.put("Indonesia",268);
        System.out.println(hm);


        //this will update the value of "Indonesia key"
        hm.put("Indonesia",270);
        System.out.println(hm);

        //3.We are using the get function 
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Utopia"));
        Integer ans=hm.get("China");
        System.out.println(ans);

        //4.We are using the ContainsKey() function to get the boolean answer whether the key is present in the hashmap
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Pakistan"));

        //5.We are using the KeySet function now 
        Set<String> keys =hm.keySet();
        
        for(String key :keys)
        {
            Integer val=hm.get(key);
            System.out.println(key+" : "+val);
        }
    }
}
