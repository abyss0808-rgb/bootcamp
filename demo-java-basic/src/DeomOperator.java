public class DeomOperator {
  public static void main(String[]args){
    //>,<,>=,<=,!=,==
    //+,-,*,?,%
    //++,--

    //%(remainder)
    System.out.println(10/3);//3,int/int->int
    System.out.println(10%3);//1
    System.out.println(27%5);//2
    System.out.println(-27%5);//-2
    //System.out.println(27%0);
    System.out.println(0%27);//0
    
      //+1
      int x = 3;
      x = x + 1;
      x+= 1;
      ++x;
      System.out.println(x);//7

      //-1
      int y = 10;
      y = y -1;
      y-=1;
      y--;
      --y;
      System.out.println(y);//6

      //+2
      int m = 13;
      m = m +2;
      m +=2;
      System.out.println(m);//17

      //-2
      int n =90;
      n =n -2;
      n -=2;
      System.out.println(n);//86

      boolean isElderty = false;
      if (isElderty== false){
        //.....
      }

      //another prsentation
      if (!isElderty){
        //.....
      }

      int age = 70;
      if (age>= 66){

      }
      char ch1 = 'z';
      if (ch1 != 'a'){
        //...
      }
      if (ch1 == 'a'){
        //...
      }
      //String 
      String s = "hello";
      if (s.equals("hello"));

  }
}
