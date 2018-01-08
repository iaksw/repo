// lambda using zero param

/*interface MyLambda {
    String sayWelcome();
  }


class LambdaExp {
  
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    
    MyLambda mLb = () -> {
      return "helloLambda";
    };
    
    //Main mObj = new Main();
  System.out.println(mLb.sayWelcome());
  }
}
*/

// lambda using single param

/*@FunctionalInterface
interface MyLambda2 {
  int incrByTen(int num);
}

class LambdaExp {
  public static void main (String[] args) {
    MyLambda2 mlb2 = (nm) -> nm + 10;
    System.out.println(mlb2.incrByTen(12));
  }
}*/

//lambda using two params

/*@FunctionalInterface
interface MyLambda3 {
  String concatn(String first, String second);
}

class Main {
  public static void main(String[] args) {
    MyLambda3 mlb3 = (String one, String two) -> {
      return one+two;
    };
    String result = mlb3.concatn("lambda", "expression***");
    System.out.println(result);
  }
}
*/

// another Lambda Exp

/*import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyLambda4 {
  String displaySentence(String wds);
}

class Main {
  public static void main(String[] args) {
    List<String> lst = new ArrayList<String>();
    lst.add("Welcome ");
    lst.add("to ");
    lst.add("the ");
    lst.add("world ");
    lst.add("of ");
    lst.add("Lambda ");
    lst.add("Expression ");
    lst.add("on Java 8");
    
    lst.forEach((words) -> System.out.println(words));
    System.out.println("############################");
 
    MyLambda4 mlb4 = (String str) -> {
      return str;
    };
    
    String resStr = lst.get(0);
    
    for (int i =1; i< lst.size(); i++){
      String sentn = mlb4.displaySentence(lst.get(i));
      resStr = resStr+sentn;
    }
    
    System.out.println(resStr);
  }
}*/

// lambda yeah

import java.util.HashMap;

@FunctionalInterface
interface LambdaMap {
  int sayToMe(int a1, int a2);
  //void display();
}

class Main {
  
  void display() {
    System.out.println("// this is display method //");
  }
  
  public static void main(String[] args) {
  HashMap<String, Integer> hMp = new HashMap<String, Integer>();
  hMp.put("Amu", 007);
  hMp.put("Mamu", 003);
  hMp.put("Samu", 004);
  hMp.put("Jamu", 012);
  hMp.put("Tamu", 112);
  hMp.put(null, 123);
  
  System.out.println(hMp);
  
  LambdaMap lmp = (int a1, int a2) -> {return (a1 + a2);};
  //System.out.println(hMp.get("Amu"));
  //System.out.println("Result using LambDaExp :" +lmp.sayToMe( hMp.get("Amu")+hMp.get("Tamu") ) );
  System.out.println(lmp.sayToMe(2,3));
  
  }
}

