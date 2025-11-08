import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        liste.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return liste.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        liste.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste); // utilise Comparable (compareTo)
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparator = Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom);
        Collections.sort(liste, comparator);
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : liste) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}
