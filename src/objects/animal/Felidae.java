package objects.animal;

import objects.Animal;

public class Felidae extends Animal {
    public Felidae(int age, int weight) {
        super(age, weight);
    }

    public void meowing() {
        System.out.println("Meow meow...");
    }
}
