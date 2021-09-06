package homework.lab3;

import com.github.javafaker.Faker;

import java.util.Random;

public class Knight extends Hero{
    Random rand = new Random();
    Faker faker = new Faker();
    public Knight() {
        name = faker.gameOfThrones().character();
        power = rand.nextInt((12 - 2) + 1) + 2;
        hp = rand.nextInt((12 - 2) + 1) + 2;
    }
}
