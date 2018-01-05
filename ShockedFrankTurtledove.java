import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class ShockedFrankTurtledove {
  
  /*void display(int a, int b) {
      System.out.println("Sum of result : "+(a+b));
    }
  */
  public static void main(String[] args) {
    System.out.println("###################");
 
    List<Integer> lts = new ArrayList<Integer>();
    
    lts.add(1);
    lts.add(4);
    lts.add(2);
    
    Collections.sort(lts);
    System.out.println(lts);
    
    /*ShockedFrankTurtledove mObj= () -> System.out.println("hi lambda");
    mObj.display(2, 3);
    */
    
    List<Integer> lts2 = new ArrayList<Integer>();
    
    for(int i=0; i<100; i++) {
      lts2.add(i);
    }
    
    Stream<Integer> seqStream = lts2.stream();
    Stream<Integer> parStream = lts2.parallelStream();
    
    //System.out.println(lts2);
    
    //filtering with lambda
    
    Stream<Integer> highSeq = seqStream.filter(p-> p>90);
    highSeq.forEach(p -> System.out.println("High seq nums"+p));
    
    Stream<Integer> highPar = parStream.filter(p-> p>90);
    highPar.forEach(p -> System.out.println("High Par nums: "+p));
    
    }
}
