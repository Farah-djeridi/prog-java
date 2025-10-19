package entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {
        super("Delphinidae", "Dolphin", 0, true, "Ocean");
        this.swimmingSpeed = 0.0f;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("The dolphin swims gracefully at " + swimmingSpeed + " km/h.");
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }
}
