public class Archer extends Hero{
  //level

  public Archer(){
    //super();
    super.setHp(Heros.MAX_HP[Heros.ARCHER][0]);
  }


  @Override
  public void levelUp(){
    super.levelUp();
    super.setHp(Heros.MAX_HP[Heros.ARCHER][super.getLevel()-1]);

  }
  
  public int getPa(){
    double number = Math.random();//0 - < 1
    double chance = Heros.CC[Heros.ARCHER][super.getLevel()-1]/100.0;
    int extraPa = 0;
    if(number < chance){
      extraPa = Heros.CD[[Heros.ARCHER][super.getLevel()-1];
    }
    return Heros.PA[[Heros.ARCHER][super.getLevel()-1];
  }

  //Critcal Damage
  //level role -> %
  //level role -> +PA

  public static void main(String[] args) {
    Archer a1 = new Archer();
    System.out.println(a1.getLevel());
    System.out.println(a1.getHp());
    System.out.println(a1.getMp());


    //max hp,max mp(level,role)
  }


}
