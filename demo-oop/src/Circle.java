public class Circle {
  //constant (Static + final)
  //final: cannot be revised after value assignment
  //static:belongs to class 
  private static final String CIRCLE_COLOR = "RED";

  //! Static - No relationship to Circle Object
  // non-final: value can be updated
  private static String brand = "BYD";


  //! the circle radius cannot be revised after object creation
  private int radius;
  //private String color;//"Red"

  public Circle(int radius){
    this.radius = radius;
    //this.color = CIRCLE_COLOR;
  }

  //Circle must be RED -> No setColor()

  //! Instance methhod -> Attribute/static variable
  //! Static method -> static variable
  public String getColor(){
    return CIRCLE_COLOR;
  }


  //radius * radius * Math.PI
  public double area(){
    return this.radius* this.radius*Math.PI;
  }
}
