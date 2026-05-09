public class String3 {
  private char[]chs;

  public String3(String str){
    this.chs = str.toCharArray();
  }

  public int length(){
    return this.chs.length;
  }

  public char charAt(int idx){
    return this.chs[idx];
  }

  // ! static method(charAt)
  public static char charAt(char[]chs, int idx){
    return chs[idx];
  }

  //! StringBuiler version

  //! String version
  public String3 replace1(char from,char to){
    String s = "";
    for(int i = 0;i<this.chs.length;i++){
      if(chs[i] == from){
        chs[i]= to;
      }
    }
    return this;
  }

  public String3 replace2(char from,char to){
    String s = "";
    for(int i = 0;i<this.chs.length;i++){
      if(chs[i] == from){
        s += to;
      }else{
        s += chs[i];
      }
    }
    return new String3(s);
  }

  public static void main(String[]args){
    String3 s = new String3("hello");
    System.out.println(s.length());//5
    System.out.println(s.charAt(0));//h

    System.out.println(s.replace2('l','x'))


  }
}
