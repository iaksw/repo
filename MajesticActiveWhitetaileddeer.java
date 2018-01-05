class MajesticActiveWhitetaileddeer {
  
  void display() {
    System.out.println("*** howz that ! ***");
  }
  
  public static void main(String[] args) {
    System.out.println("************ J8 ***************\n");
    
    Runnable mObj = (Runnable) () -> {
      System.out.println(" ############ from Lambda ###########");
    };
    
    MajesticActiveWhitetaileddeer mObj2 = new MajesticActiveWhitetaileddeer();
    mObj.run();
    mObj2.display();
  }
  
}
