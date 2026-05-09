public class DemoWrapperClass {
  public static void main(String[]args){
    //!Primitives
    //byte,short,int,long,float,double,char,boolean

    //!Class
    //String
    //Byte,Short,Integer,Long,Float,Double,Character,Boolean



    //! byte -> short -> int -> long -> float -> double
    //! char -> int

    //!Primitive -> Wrapper Class (Autobox)

    byte b1 = 127;//Java Special Handling - compile checking
    Byte b2 = 127;//Java Special Handling - compile checking

    short s1 = 32000;//Java Special Handling - compile checking
    Short s2 = 32000;//Java Special Handling - compile checking

    int i1 = 2_100_000_000;
    Integer i2 = 2_100_000_000;

    long l1 = 2_000_000;//int value -> long variable
    long l2 = 2000000L;// long value -> long variable
    //Long l3 = 2000000; //!error: int -> long (promption)-> Long (autobox)
    Long l3 = 20000L;


    float f1 = 0.1234f;
    Float f2 = 0.1234f;//autobox(float value -> Float Variable)

    double d1 = 0.1234;
    Double d2 = 0.1234;
  
    char ch1 = 'a';
    Character ch2 = 'a';//autobox(char value ->)

    boolean bool1 = false;
    Boolean bool2 = false;//autobox (boolean value -> Boolean Variable)

    //! error: float -> double -> Double
    // Double d3 = 0.123f;
  }
}










  }
}
