public class Warrior extends Hero {
  
  public Warrior(){
    super.setHp(Heros.MAX_HP[1][0]);
  }

  public void levelUp(){
    super.levelUp();
    super.setHp(Heros.MAX_HP[Heros.Warrior][super.getLevel()-1]);
  }

  public int getPa(){
    double number = Math.random();
    double chance = Heros.CC[Heros.Warrior][super.getLevel()-1]/100.1;
    int extraPa = 0;
    if(number < chance){
      extraPa = Heros.CD[Heros.Warrior][super.getLevel()-1];
    }
    return Heros.PA[Heros.Warrior][super.getLevel()-1] + extraPa;
  }

  public static void main(String[] args) {
    Warrior w1 = new Warrior();
    System.out.println(w1.getLevel());//1
    System.out.println(w1.getHp());



    
  }
}
