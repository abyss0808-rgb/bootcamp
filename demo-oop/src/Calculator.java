public class Calculator {
  private int x;
  private int y;

  public Calculator(){
  }

  public void setX(int x ){
    this.x = x ;
  }

  public void setY(int y){
    this.y = y;
  }

  public int sum(){
    return this.x + this.y;
  }
  
  //1 + 3 -> 4
  // ! Static Method:input params -> output
  // ! Static Method: Belongs to Class (not Object)
  //   public static int sum(int x,int y){
    return x + y;
  }

// 10-5
public static int subtract(int x, int y){
  return x - y;
}

public static void main(String[]args){
  System.out.println(sum(1,3));
  System.out.println(subtract(1,3));

  //!How to revise the design became OOP?

  Calculator c1 = new Calculator();
  c1.setX(10);
  c1.setY()
   }
}
