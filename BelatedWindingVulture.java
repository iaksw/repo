import java.util.*;

class BelatedWindingVulture {
  public static void main(String[] args) {
    System.out.println("############# HashSet ##########");
    
    HashSet<String> hSet = new HashSet<String>();
    
    System.out.println();
    
    hSet.add("H");
    hSet.add("A");
    hSet.add("S");
    hSet.add("H");      // duplicate entry
    hSet.add("S");      // duplicate entry
    hSet.add("E");
    hSet.add("T");
    
    System.out.println("HashSet Contains : "+hSet);
    System.out.println("//hashset dont contains duplicate items");
    System.out.println("HashSet size : "+hSet.size());
    
    hSet.remove("H");
    
    System.out.println("After removing 'H' HashSet Contains : "+hSet);
    
    //using iterator over HashSet
    Iterator<String> itr = hSet.iterator();
    
    System.out.println("printing HashSet with iterator###");
    while(itr.hasNext()){
      System.out.println("Items :"+itr.next());
    }
  }
}
