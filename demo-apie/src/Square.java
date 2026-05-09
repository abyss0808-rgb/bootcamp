//!Child Class
public class Square extends Shape{
  private double length;

public Square(double length,Color color){
  super(color);//!calling Parent Constructior
  this.length = length;
}

public double getLength(){
  return this.length;
}

public void setLength(double length){
  this.length = length;
}

public static void main(String[] args) {
  //2 Java Object(each java object has its parent container)
  Square s1 = new Square(3.5, Color.BLACK);
  Square s2 = new Square(4.0, Color.BLUE);

  //Square Class inherits Shape Class's methods(getColor,setColot)

  System.out.println(s1.getLength());//3.5
  System.out.println(s2.getLength());//4.0
}


}
