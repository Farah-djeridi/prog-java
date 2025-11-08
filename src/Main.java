public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employe e1 = new Employe(1, "Ali", "Ben", "Informatique", 3);
        Employe e2 = new Employe(2, "Sami", "Trabelsi", "RH", 2);
        Employe e3 = new Employe(3, "Noura", "Khaled", "Informatique", 1);
        Employe e4 = new Employe(4, "Leila", "Bennour", "Finance", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("=== Liste initiale ===");
        societe.displayEmploye();

        System.out.println("\n=== Tri par ID ===");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n=== Tri par Département, Grade et Nom ===");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n=== Recherche par nom 'Sami' ===");
        System.out.println(societe.rechercherEmploye("Sami") ? "Trouvé ✅" : "Non trouvé ❌");

        System.out.println("\n=== Recherche par département 'Informatique' ===");
        for (Employe e : societe.rechercherParDepartement("Informatique")) {
            System.out.println(e);
        }

        System.out.println("\n=== Suppression d’un employé ===");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}
