public class DemoSrtingBuiler {
  public static void main(String[]args){
    //!1. Performance: String vs StringBuiler
    //StringBuiler wins!!

    String s = " hello";

    long before = System.currentTimeMillis();

    System.out.println(after — before);//3-4 ms

    StringBuilder s2 = new StringBuilder("hello");
  }
}
