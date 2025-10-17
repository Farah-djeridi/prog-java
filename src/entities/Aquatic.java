package entities;

public class Aquatic extends animal {
    protected String habitat;

    public Aquatic() {
        super("Unknown Family", "Unknown Aquatic", 0, false);
        this.habitat = "Unknown Habitat";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }
}