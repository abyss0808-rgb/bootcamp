public class Circle extends Shape{
  private double radius;
  // String not appropriate for color: Java is case sensitive
  //private Color color;

  public Circle(double radius,Color color,String name){
    super(color,name);
    this.radius = radius;
  
  public Circle(double radius,Color color){}
    super(color);
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public static void main(String[]args){
    Circle c1 = new Circle(3.5,Color.RED);//
    System.out.println(c1.getRadius());
    System.out.println(c1.getColor());
    c1.setColor(Color.BLACK);
    System.out.println(c1.getColor));
    System.out.println(c1.getColor().getValue());
    System.out.println(c1.getColor().getDescription());

    Circle c2 = new Circle(, null)
    
  }


}
