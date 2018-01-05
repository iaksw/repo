
/*
class Main {
  
  interface MyInter {
    boolean compare(int a, int b);
  }
  
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    
    MyInter mObj = (a, b) -> return a>b;
    boolean result = mObj.compare(2,5);
    
    System.out.println("First no > second no : "+result);
  }
}*/

public class InsignificantHomelySeabird {
   
    interface IntegerMath {
        int operation(int a, int b);   
    }
   
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
  
    public static void main(String... args) {
     
        InsignificantHomelySeabird myApp = new InsignificantHomelySeabird();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));    
    }
}
