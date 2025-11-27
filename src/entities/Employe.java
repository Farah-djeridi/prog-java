package entities;

import java.util.Objects;

public class Employe {
    private int id;
    private String nom;

    public Employe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }

    @Override
    public String toString() {
        return "Employe{id=" + id + ", nom='" + nom + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employe = (Employe) o;
        return id == employe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
