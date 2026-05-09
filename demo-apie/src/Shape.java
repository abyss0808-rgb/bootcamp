//! Parent Class
//抽象
public abstract class Shape {
  private Color color;
  private String name;


  //!Not for object creation

  public Shape(String name,Color color){
    this.color = color;
    this.name = name;
  }

  public Shape(Color color){
    this.color = color;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public Color getColor(){
  return this.color;
}

public void setColor(Color color){
  this.color =color;
}
}
