public class Main {
    public static void main(String[] args) {

        animal lion = new animal("Felidae", "Lion", 5, true);
        animal tiger = new animal("Felidae", "Tiger", 4, true);
        animal crocodile = new animal("Crocodylidae", "Crocodile", 12, false);
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 20);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = tiger;
        myZoo.animals[2] = crocodile;

        myZoo.displayZoo();

        System.out.println("-----");


        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(crocodile);
    }
}
