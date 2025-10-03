package main;

import entities.Zoo;
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

        // test de remplissage du zoo
        for (int i = 0; i < 30; i++) {
            myZoo.addAnimal(new animal("Test", "Animal" + i, i, true));
        }

        myZoo.displayZoo();
        myZoo.displayAnimals();

        System.out.println("Recherche du Lion → index : " + myZoo.searchAnimal(lion));

        animal lion2 = new animal("Felidae", "Lion", 6, true);
        System.out.println("Recherche Lion2 → index : " + myZoo.searchAnimal(lion2));

        System.out.println("-----");
        System.out.println("Suppression du Lion : " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(crocodile);

        Zoo zoo2 = new Zoo("Friguia", "Hammamet");
        zoo2.addAnimal(new animal("Canidae", "Fox", 3, true));

        System.out.println("Zoo avec plus d’animaux : " + Zoo.comparerZoo(myZoo, zoo2));
    }
}
