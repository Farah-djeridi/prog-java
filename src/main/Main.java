package main;

import entities.*;

public class Main {
    public static void main(String[] args) {
        animal lion = new animal("Felidae", "Lion", 5, true);
        animal tiger = new animal("Felidae", "Tiger", 4, true);
        animal crocodile = new animal("Crocodylidae", "Crocodile", 12, false);

        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(crocodile);

        System.out.println("=== INSTRUCTION 25 à 28 ===");
        Aquatic aquatic = new Aquatic("Poisson", "Poisson rouge", 2, true, "Bassin") {
            @Override
            public void swim() {
                System.out.println("Le poisson rouge nage dans le bassin.");
            }
        };
        Dolphin dolphin = new Dolphin("Delphinidae", "Dauphin", 8, true, "Océan", 35.5f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Pingouin", 4, true, "Antarctique", 50.0f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingouin Empereur", 5, true, "Antarctique", 75.0f);

        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);

        myZoo.makeAquaticSwim();

        System.out.println("Profondeur maximale des pingouins : " + myZoo.maxPenguinDepth() + " mètres");
        myZoo.countAquaticTypes();

        // Test equals
        System.out.println("\n=== INSTRUCTION 31 : Test equals ===");
        Aquatic dolphin2 = new Dolphin("Delphinidae", "Dauphin", 8, true, "Océan", 30.0f);
        System.out.println("Dauphin1 equals Dauphin2 ? " + dolphin.equals(dolphin2));

        System.out.println("\n=== Affichage Zoo ===");
        myZoo.displayZoo();
        myZoo.displayAnimals();
        System.out.println(myZoo);
    }
}
