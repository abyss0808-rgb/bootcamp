import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

public class DemoLocalDate {
  public static void main(String[]args){
    //Java 1.0
    Date d1 = new Date(2025,10,3);

    //Java 8 (2014)
    LocalDate ld = LocalDate.of(2026,12,31);
    System.out.println(ld.plusDays(1L));//2027 -01-01

    //plusMonth,plusYear
    System.out.println(ld.plusYears(3L));//2029-12-31
    System.out.println(ld.plusMonths(3L));//2027-03-31
    //minus
    System.out.println(ld.minusDays(1000L));
    System.out.println(ld.minusWeeks(1L));


    //isBefore,isAfter (Comarsion)
    //now
    System.out.println(LocalDate.now());
    if(LocalDate.now().isAfter(LocalDate.of(2026,1,1))){

    }

    if(LocalDate.now().getYear() == 2026){

    }

    if(LocalDate.now().getMonthValue() == 12){

    }

    if(LocalDate.now().getMonth() == Month.DECEMBER){

    }

    LocalDate ld2 = LocalDate.of(2100,1,1);
    System.out.println(ld2.isLeapYear());//false


    //divided by 4 (Leap Year)
    //divided by 100 (Not Leap Year)
    //divided by 400 (Leap Year)
    int year = 2100;
    if(year % 4 == 0){
      if(year % 100 ==0){//2100
        if(year % 400 ==0){//2000
          System.out.println("Leap Year");
        }else{//2100
          System.out.println("Not Leap Year");
          }
        }else{//2024
          System.out.println("Leap Year");
        }
    }else{
      System.out.println("Leap Year");//2023
    }

   
  }
}
