public class DemoString {
  public static void main(String[]args){
    String s ="abc";

    //int,double (Primitive)

    //String ->(Class,developed by Human)
    //Method (工具)
    //Method name ->xxx ()
    System.out.println(s.length());//3
    s = "hello";
    System.out.println(s.length());//5

    //shortcut
    //sysout + enter (VSCode)

    s = "";//""->empty string value
    System.out.println(s.length());//0

    //We can provide input data into the Method,then Method return output.
    //!2.charAt(int index)->index starts from 0 (the first character)
    s = "Java";
    System.out.println(s.charAt(0));//J
    System.out.println(s.charAt(3));//a

    //System.out.println(s.charAt(-1));//runtime error
    //System.out.println(s.charAt(4));//runtime error

    //print the last character
    System.out.println(s.charAt(s.length()-1));//a

    //!3.equals() -> return boolean
    //int/double(==,>=,<=,!=,>,< for Primitves ONLY)
    s = "Python";
    System.out.println(s.equals("Python"));//ture,check if they are same value
    System.out.println("Python".equals(s));//ture

    //!4.isEmpty() -> return boolean
    s= "React";
    System.out.println(s.isEmpty());//false
    System.out.println(s.isEmpty());//true

    //!5.index0f(char ch )->return int index
    s= "C++";
    System.out.println(s.indexOf('+'));//1(index = 1 -> the 2nd character)
    System.out.println(s.indexOf('C'));

    //!6. replace() -> reutrn String
    s = "Bootcamp";
    System.out.println(s.replace('o','x'));//Bxxtcamp
    System.out.println(s.replace("am","xxxxx"));//Bootcxxxxxp

    //!7.toUpperCase/ toLowerCase -> reutrn String
    String s3 = "Hello";
    System.out.println(s3.toUpperCase());//HELLO
    System.out.println(s3.toLowerCase());//hello
    System.out.println(s3);//Hello

    //!8.substring -> return substring
    String s4 = "Python";
    System.out.println(s4.substring(1,3));//"yt"
    System.out.println(s4.substring(2,5));//"tho"
    System.out.println(s4.substring(0));//"Python"
    System.out.println(s4.substring(1));//"ython"
  //System.out.println(s4.substring(9));//error

  //!9.contains -> return boolean
  String s5 = "bootcamp";
  if(s5.contains("oo")){
    System.out.println("s5 contains \ "oo\"");
  }
  //check s5 dose not contain "xx"
  if (!s5.contains("xx")){
    System.out.println("s5 contains")
  }

//!11.lastIndexOf
String s6 = "abcoodefooijk";
System.out.println(s6.lastIndexOf("o"));//9
System.out.println(s6.indexOf('o'));//3

//!12.trim -> return String (remove leading and tailing space)
String s7= "   Hello world !!!"
System.out.println(s7.trim());

//!13.isBlank -> boolean
System.out.println("".isEmpty());//ture
System.out.println(" ".isEmpty()));//false
System.out.println("abc".isEmpty();//false

System.out.println("".isBlank());//ture
System.out.println(" ".isBlank());//ture
System.out.println("abc".isBlank());//false

//!14.startsWith/endsWith -> boolean
String s8 = "King"
System.out.println(s8.startsWith("Kin"));//ture
System.out.println(s8.startsWith("kin"));//false
System.out.println(s8.endsWith("Kin"));//false
System.out.println(s8.endsWith("ng"));//ture


  }
}
