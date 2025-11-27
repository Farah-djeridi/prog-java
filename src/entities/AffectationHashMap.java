package entities;

import java.util.*;

public class AffectationHashMap {

    private HashMap<Employe, Departement> map = new HashMap<>();


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (map.containsKey(e)) {
            System.out.println("Cet employé est déjà affecté à un département !");
        } else {
            map.put(e, d);
            System.out.println(" Affectation ajoutée.");
        }
    }


    public void afficherEmployesEtDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucune affectation.");
            return;
        }
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }


    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }


    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
            System.out.println("Affectation supprimée.");
        } else {
            System.out.println("L'affectation n'existe pas.");
        }
    }


    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }


    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }


    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }


    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }
   // 10. Tri des employés par ID
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sorted =
                new TreeMap<>(Comparator.comparingInt(Employe::getId));
        sorted.putAll(map);
        return sorted;
    }
}
