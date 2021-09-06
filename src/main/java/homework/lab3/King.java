package homework.lab3;

import com.github.javafaker.Faker;

import java.util.Random;

public class King extends Hero {

    Random rand = new Random();
    Faker faker = new Faker();
    public King() {
        name = faker.gameOfThrones().character();
        power = rand.nextInt((15 - 5) + 1) + 5;
        hp = rand.nextInt((15 - 5) + 1) + 5;
    }
}
