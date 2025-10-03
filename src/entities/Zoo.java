package entities;


public class Zoo {
    private animal[] animals = new animal[25]; // max 25 animaux
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals = 0;

    public Zoo(String name, String city) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du Zoo ne doit pas être vide !");
        }
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein, impossible d'ajouter : " + animal.getName());
            return false;
        }
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("Animal déjà présent : " + animal.getName());
                return false;
            }
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Number of animals: " + nbrAnimals);
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}
