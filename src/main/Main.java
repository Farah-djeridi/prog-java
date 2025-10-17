package main;

import entities.*;
import entities.animal;

public class Main {
    public static void main(String[] args) {

        animal lion = new animal("Felidae", "Lion", 5, true);
        animal tiger = new animal("Felidae", "Tiger", 4, true);
        animal crocodile = new animal("Crocodylidae", "Crocodile", 12, false);

        Zoo myZoo = new Zoo("Safari Park", "Tunis");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(crocodile);

        System.out.println("=== INSTRUCTION 21 : Instanciation avec constructeurs par défaut ===");
        Aquatic aquaticDefault = new Aquatic();
        Terrestrial terrestrialDefault = new Terrestrial();
        Dolphin dolphinDefault = new Dolphin();
        Penguin penguinDefault = new Penguin();

        System.out.println("Aquatic par défaut créé: " + aquaticDefault);
        System.out.println("Terrestrial par défaut créé: " + terrestrialDefault);
        System.out.println("Dolphin par défaut créé: " + dolphinDefault);
        System.out.println("Penguin par défaut créé: " + penguinDefault);
        System.out.println();


        System.out.println("=== INSTRUCTION 22 : Instanciation avec constructeurs paramétrés ===");
        Aquatic aquatic = new Aquatic("Poisson", "Poisson rouge", 2, true, "Bassin");
        Terrestrial terrestrial = new Terrestrial("Canidae", "Chien", 3, true, 4);
        Dolphin dolphin = new Dolphin("Delphinidae", "Dauphin", 8, true, "Océan", 35.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingouin", 4, true, "Antarctique", 50.0f);

        System.out.println("Aquatic créé: " + aquatic);
        System.out.println("Terrestrial créé: " + terrestrial);
        System.out.println("Dolphin créé: " + dolphin);
        System.out.println("Penguin créé: " + penguin);
        System.out.println();


        System.out.println("=== INSTRUCTION 23 : Test des méthodes toString() ===");
        System.out.println("Aquatic toString: " + aquatic);
        System.out.println("Terrestrial toString: " + terrestrial);
        System.out.println("Dolphin toString: " + dolphin);
        System.out.println("Penguin toString: " + penguin);
        System.out.println();


        System.out.println("=== INSTRUCTION 24 : Comportement de nage ===");
        System.out.print("Aquatic swim: ");
        aquatic.swim();

        System.out.print("Dolphin swim: ");
        dolphin.swim();

        System.out.print("Penguin swim: ");
        penguin.swim();
        System.out.println();


        System.out.println("=== Ajout des animaux au zoo ===");
        System.out.println("Ajout Aquatic: " + myZoo.addAnimal(aquatic));
        System.out.println("Ajout Terrestrial: " + myZoo.addAnimal(terrestrial));
        System.out.println("Ajout Dolphin: " + myZoo.addAnimal(dolphin));
        System.out.println("Ajout Penguin: " + myZoo.addAnimal(penguin));


        myZoo.displayZoo();
        myZoo.displayAnimals();

        System.out.println("Recherche du Lion → index : " + myZoo.searchAnimal(lion));

        animal lion2 = new animal("Felidae", "Lion", 6, true);
        System.out.println("Recherche Lion2 → index : " + myZoo.searchAnimal(lion2));

        System.out.println("-----");
        System.out.println("Suppression du Lion : " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        System.out.println(myZoo);

        Zoo zoo2 = new Zoo("Friguia", "Hammamet");
        zoo2.addAnimal(new animal("Canidae", "Fox", 3, true));

        System.out.println("Zoo avec plus d'animaux : " + Zoo.comparerZoo(myZoo, zoo2).getClass());
    }
}