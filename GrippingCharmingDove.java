// implementing hashmap

import java.util.Map;
import java.util.HashMap;

class GrippingCharmingDove {
  public static void main(String[] args) {
    System.out.println("#####Hi Hashmap ####");
    
    HashMap<String, Integer> hMap= new HashMap<>();
    
    System.out.println("HashMap init values :");
    System.out.println(hMap);
    hMap.put("Visi", 10);
    hMap.put("Kisi", 15);
    hMap.put("arsi", 22);
    
    System.out.println("HashMap Size: "+hMap.size());
    
    System.out.println("HashMap Now Contains");
    System.out.println(hMap);
    
  /*  for(int init=0; init<hMap.size();init++){
      if(hMap.containsKey("Visi")){
        System.out.println("Visi Contains value :"+hMap.get("Visi"));
      }
    }*/
    
    if(hMap.containsKey("Visi")){
        System.out.println("Visi Contains value :"+hMap.get("Visi"));
      }
    
    hMap.clear();
    print(hMap);
  }
  
  public static void print(Map<String, Integer> sMap){
    if(sMap.isEmpty()){
      System.out.println("HashMap : Empty");
    }
    else{
      System.out.println(sMap);
    }
  }
  
}
