package entities;

public abstract class Aquatic extends animal {
    protected String habitat;

    public Aquatic() {
        super("Unknown Family", "Unknown Aquatic", 0, false);
        this.habitat = "Unknown Habitat";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }
}
