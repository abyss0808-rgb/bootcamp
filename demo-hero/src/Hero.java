public abstract class Hero {
  private int hp;
  private int mp;
  private int level;

  //level 1

  public Hero(){
    this.level = 1; 
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public void setMp(int mp){
    this.mp = mp;
  }

  public void levelUp(){
    this.level++;
  }

  public int getLevel(){
    return this.level;
  }


}
