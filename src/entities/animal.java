package entities;



public class animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.setName(name);
        this.setAge(age);
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l’animal ne doit pas être vide !");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L’âge d’un animal ne peut pas être négatif !");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

