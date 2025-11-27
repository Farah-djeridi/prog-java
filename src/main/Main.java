package main;

import entities.AffectationHashMap;
import entities.Departement;
import entities.Employe;

public class Main {
    public static void main(String[] args) {

        Departement d1 = new Departement(101, "IT");
        Departement d2 = new Departement(102, "RH");

        Employe e1 = new Employe(1, "Ali");
        Employe e2 = new Employe(2, "Mouna");

        AffectationHashMap affect = new AffectationHashMap();

        affect.ajouterEmployeDepartement(e1, d1);
        affect.ajouterEmployeDepartement(e2, d2);


        affect.ajouterEmployeDepartement(e1, d2);

        System.out.println("----- Affectations -----");
        affect.afficherEmployesEtDepartements();

        System.out.println("----- Employés triés -----");
        System.out.println(affect.trierMap());
    }
}
