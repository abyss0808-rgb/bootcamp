//! Finite Possible Values
//! Not usually change -> programming change
public enum Color {
  RED('R'), BLUE('B'),BLACK('K');

  private char value;
  private String description;//red,blue,black

  private Color(char value){
    this.value = value;
  }

  private char getValue(){
    return this.value;
  }

  public String getdescription(){
    return this.description;
  }

  // Carry value
}
