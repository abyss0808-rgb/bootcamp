public class DemoIf {
  public static void main(String[] args){
    //
    int x = 5;
    if(x > 0){
      System.out.println("x>0");//print
    }else{
      System.out.println("x<= 0");
    }
    char ch = 'k';
    //check if ch is small letter or capital letter
    if (ch>= 97){
      System.out.println("small letter");
    }else {
      System.out.println("capital letter");
    }

    //and ->&&
    //or -> ||
    if (ch>=97 && ch <= 122){
      System.out.println("small letter");
    }else if (ch >= 65 && ch <= 90){
      System.out.println("capital letter");
    }

    char ch2 = 'F';
    //check if ch2 is better 
    //print "it is a letter"
    //print "it is not a letter"

    if((ch2>= 97 && ch2 <= 122)|| (ch>= 65 && ch<= 90)){
      System.out.println("it is a letter");
    }else {
      System.out.println("it is not a letter");
    }

    boolean isCapitalLetter = ch >=65 &&ch <=90;
    boolean isSmallLeter = ch2 >= 97 && ch2 <= 122;
    if (isCapitalLetter || isSmallLeter){
      System.out.println("it is a letter");
    }else{
      System.out.println("it is not a letter");
    }

    int score = 75;
    //Grade=C
    char grade = 'A';
    if(score>=90){
    }else if (score >= 80){
      grade = 'B';
    }else if (score >= 70){
      grade = 'C';
    }else{
      grade = 'F';
    }
    System.out.println("Grade="+ grade);

    //score >= 90->grade A
    //score between 80 and 89-> grade B
    //score between 70 and 79-> grade C
    //score below 70 -> grade F

    //String + if 
    //length(),equals(),charAt(),replace(),indexOf()

    //ValidPassword 
    //1.length >= 8
    //2.First Character ->small letter 
    //3.Last Character ->small letter 
    //4.At least one Special Character ->$#_

    String password = "habc1234c";

    boolean isFirstCharSmallLetter = password.charAt(0)>= 97 && password.charAt(0) <= 122;
    boolean isLastCharSmallLetter = password.charAt(password.length()-1) >= 97 && password.charAt(password.length() -1) <= 122;

    boolean isWithSpecialChar = password.indexOf('$')!=-1
    || password.indexOf('#')!=-1 || password.indexOf('_')!=-1;
    boolean isValidLength = password.length()>=8; 

    //Question 1:
    //print "Password is valid."
    //print "Password is invalid."

    if (isValidLength && isFirstCharSmallLetter && isLastCharSmallLetter
      && isWithSpecialChar){
        System.out.println("Password is valid.");
      }else{
        System.out.println("Password is invlid.");
      }

    //Question 2(Print any Invalid Reason):
    //print "Length should be >= 8"
    //print "First Character should be small letter"
    //print "At least one Special Character"


    if(!isValidLength){
      System.out.println("Length should be >= 8.");
    }else if(isFirstCharSmallLetter){
      System.out.println("First Character should be small letter.");
    }else if(isLastCharSmallLetter){
      System.out.println("Last Character should be small letter");
    }else if(!isWithSpecialChar){//!!!
      System.out.println("At least one Special Character.");
    }else {
      System.out.println("Password is vaild.");
    }


    
  }
}
