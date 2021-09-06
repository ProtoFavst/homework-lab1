package homework.lab3;

import com.github.javafaker.Faker;

public class Hobbit extends Hero{
    Faker faker = new Faker();
    public Hobbit() {
        name = faker.gameOfThrones().character();
        power = 0;
        hp = 3;
    }

    public void toCry(){
        System.out.println("Plak-Plak");
    }

    @Override
    public void kick(Hero c) {
       this.toCry();
    }
}
