public class Demo.String {
  public static void main(String[]args}){
    String s1 = "hello";
    String s2 = " hello";
    System.out.println(s2.equals(s2));//true
    System.out.println(s1 == s2);//ture (Same Object,Literal Pool)

    System.s3 = new String("hello");//Force to creeate new object
    System.out.println(s1.equals(s3));
    System.out.println(s1 ==s3);//false(
    )
  }
}
