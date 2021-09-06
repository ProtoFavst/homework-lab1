package homework.lab3;

import com.github.javafaker.Faker;

public class Elf extends Hero {
    Faker faker = new Faker();
    public Elf() {
        name = faker.gameOfThrones().character();
        power = 10;
        hp = 10;
    }

    @Override
    public void kick(Hero c) {
        if(c.power>=this.power){
            c.power-=1;
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " decrease power of "+ c.getClass().getSimpleName()+ " " + c.name + " for 1");
        }
        else {c.hp =0;
            System.out.println(this.getClass().getSimpleName()+ " " + this.name + " killed "+ c.getClass().getSimpleName()+" " + c.name);
        }
    }

}
