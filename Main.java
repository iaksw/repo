import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;
import java.time.Duration;

@FunctionalInterface
interface MethodRefs {
    void displayInterfc();
}
  

class Main {
  
    void displayMain() {
      System.out.println("Hello Method Reference!");
    }
  
  public static void main(String[] args) {
    
    Main mObj = new Main();
    
    //MethodRefs mref = Main::displayMain;
    MethodRefs mref = mObj::displayMain;
    mref.displayInterfc();
   
   LocalDateTime ldt = LocalDateTime.now();
   System.out.println(ldt);
   
   LocalDate ld3 = ldt.toLocalDate();
   Month mth = ldt.getMonth();
   int min = ldt.getMinute();
   int day = ldt.getDayOfMonth();
   
   System.out.println(ld3);
   System.out.println(mth);
   System.out.println(min);
   System.out.println(day);
   
   
   
   LocalDate dt = LocalDate.of(2021, Month.JULY, 1);
    System.out.println(dt);
    
   LocalTime lt = LocalTime.of(17, 12, 01);
    System.out.println(lt);
   LocalTime lt2 = LocalTime.parse("23:12:01");
    System.out.println(lt2);
   
   Duration drn = Duration.ofHours(5);
   Duration drn2 = drn.plusMinutes(10);
    System.out.println(drn);
    System.out.println(drn2);
   
  }
}
