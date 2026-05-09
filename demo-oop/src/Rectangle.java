import java.math.BigDecimal;

//Example of Presentation

//!Class Author
public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length,double width){
   this.length = length;
   this.width = width;
  }

  //area = length * width
  //!Pesentation
  public double area(){
    return BigDecimal.valueOf(this.length)//
      .multiply(BigDecimal.valueOf(this.width));//
    .doubleValue();
  }

  public double getLength(){
    return this.length;
  }

  public double getWidth(){
    return this.width;
  }

  public static void main(String[]args){
    Rectangle r1 = new Rectangle(10.5,8.0);
    r1

  }
  

  
}
