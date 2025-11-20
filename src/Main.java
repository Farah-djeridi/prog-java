public class Main {
    public static void main(String[] args) {
        DepartementHashSet dhs = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 40);
        Departement d2 = new Departement(2, "RH", 10);
        Departement d3 = new Departement(3, "Marketing", 25);

        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);

        System.out.println("Liste des départements :");
        dhs.afficherDepartements();

        System.out.println("\nRecherche par nom : " + dhs.rechercherDepartement("Informatique"));
        System.out.println("Recherche par objet : " + dhs.rechercherDepartement(d2));

        System.out.println("\nTri par ID :");
        dhs.trierDepartementsParId();

        System.out.println("\nTri par nom + nombre employés :");
        dhs.trierDepartementsParNomEtNombreEmployes();
    }
}
