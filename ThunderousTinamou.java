import java.io.*;
import java.util.*;

class ThunderousTinamou{
  public static void main(String[] args) throws IOException{
    System.out.println("#################!");

    ArrayList<Integer> arrli = new ArrayList<Integer>(5);
  
    for(int i=1; i<=5; i++){
      arrli.add(i);
    }
    System.out.println(arrli);
    
    System.out.println("Removing index 3");
    arrli.remove(3);   // index 3
    
    System.out.println(arrli);
    
    System.out.println("Item at index 3");
    System.out.println(arrli.get(3));
    
    System.out.println("Currently list contains: \n");
    for(int lsize=0; lsize<arrli.size();lsize++){
      System.out.println(arrli.get(lsize));
    }
  }
  
}
