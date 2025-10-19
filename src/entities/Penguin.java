package entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {
        super("Spheniscidae", "Penguin", 0, true, "Antarctic");
        this.swimmingDepth = 0.0f;
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("The penguin swims at a depth of " + swimmingDepth + " meters.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
