public class DemoPrimtive {
  public static void main(String[]args){
    //!8 Primitives
    //byte,short,int,long
    //float,double
    //char
    //booleam

    //!1.boolean
    int age = 48;
    boolean isAdult = age >=18;
    if (isAdult){

    }

    //!2.char(Single Character ONlY)
    char ch1 = 'a';
    ch1 ='+';
    ch1 ='-';
    ch1= '{';
    ch1=' ';
    //ch1 = '  ';
    //ch1= '';

    ch1 = '?';
    System.out.println(ch1);//

    //!3.byte,short,int,long

    //!byte(-128 ->127)
    byte b1 = 127;
    //byte b2 = 128;
    
    //!short(-32xxx -> 32xxx)
    short s1 = -32000;
    //short s1 = -33000;

    //!int (-2_1xx_xxx_xxx to 2_1xx_xxx_xxx)
    int amount = 1_000_000;
    amount = 2_100_000_000;
    //amount = 2_200_000_000

    //!long (-2^63 to 2^63 - 1)
    //Step 1: int value 2_200_000_000(invalid int value)->error
    //Step 2 :did not start step 2
    //long l1 = 2_200_000_000;

    //Soluton
    //Step 1 : long value 2_200_000_000
    //Step 2 : assign long value into long varible
    long l1= 2_200_000_000L;

    //!We can only define an int value or long value,but no byte and short value
    //127 is an int value
    //127L is a long value

    //!float, double
    //99.99 -> double value
    //99.99d -> double value
    double d5 = 99.99d;

    //99.99f ->float value
    float f4 = 99.99f;

    //We cannot assign double value into float variable
    //float f5 = 99.99;
    }
  }
}
