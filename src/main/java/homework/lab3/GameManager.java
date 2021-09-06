package homework.lab3;

public class GameManager {
    public void fight(Hero a, Hero b){
        while(a.isAlive() && b.isAlive()){
            a.kick(b);
            b.kick(a);
        }
        if(!a.isAlive() && !b.isAlive()){
            System.out.println("All in all, everyone died");
        }
        else if (a.isAlive()){
            System.out.println(a.getClass().getSimpleName()+ " " + a.name + " has won the battle");
        }
        else if (b.isAlive()){
            System.out.println(b.getClass().getSimpleName()+ " " +b.name  +" has won the battle");
        }

    }
}
