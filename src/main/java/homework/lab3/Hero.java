package homework.lab3;

public abstract class Hero {
      String name;
      int power;
      int hp;
      public void kick(Hero c){
          c.hp -= this.power;
          System.out.println(this.getClass().getSimpleName()+ " " + this.name + " kicked "+ c.getClass().getSimpleName()+ " " + c.name + " for "+this.power);

    }
      public boolean isAlive(){
          if (hp <= 0) {return false;}
          return  true;
      }


}
