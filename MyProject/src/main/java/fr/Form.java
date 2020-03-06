package fr;

import java.util.Scanner;

public class Form {
    

    public static void fraisForfait() {
        Scanner console;
        console = new Scanner(System.in);
        System.out.print("Entrez la Quantité pour la categorie Nuitée : ");
        int infoNuitéeQt = console.nextInt();
        System.out.print("Entrez le Montant Unitaire pour la categorie Nuitée : ");
        int infoNuitéeMu = console.nextInt();
        System.out.print("Entrez le Total pour la categorie Nuitée : ");
        int infoNuitéeT = console.nextInt();
        System.out.println(" | Nuitée      | " + infoNuitéeQt + " | " + infoNuitéeMu + " | " + infoNuitéeT + " | ");

        console = new Scanner(System.in);
        System.out.print("Entrez la Quantité  pour la categorie repas midi : ");
        int infoRepasMidiQt = console.nextInt();
        System.out.print("Entrez le Montant Unitaire pour la categorie repas midi : ");
        int infoRepasMidiMu = console.nextInt();
        System.out.print("Entrez le Total pour la categorie repas midi : ");
        int infoRepasMidiT = console.nextInt();
        System.out.println(
                " | Repas Midi  | " + infoRepasMidiQt + " | " + infoRepasMidiMu + " | " + infoRepasMidiT + " | ");

        console = new Scanner(System.in);
        System.out.print("Entrez la Quantité  pour la categorie Kilometrage : ");
        int infoKmQt = console.nextInt();
        System.out.print("Entrez le Montant Unitaire pour la categorie Kilometrage : ");
        int infoKmMu = console.nextInt();
        System.out.print("Entrez le Total pour la categorie Kilometrage : ");
        int infoKmT = console.nextInt();
        System.out.println(" | Kilometrage | " + infoKmQt + " | " + infoKmMu + " | " + infoKmT + " | ");

        System.out.println();
        System.out.println("Résumé : ");
        System.out.println();

        System.out.println("  _________________________");
        System.out.println(" | Nuitée      | " + infoNuitéeQt + " | " + infoNuitéeMu + " | " + infoNuitéeT + " | ");

        System.out.println(
                " | Repas Midi  | " + infoRepasMidiQt + " | " + infoRepasMidiMu + " | " + infoRepasMidiT + " | ");

        System.out.println(" | Kilometrage | " + infoKmQt + " | " + infoKmMu + " | " + infoKmT + " | ");
        System.out.println("  _________________________");

    }

    public static void phrase() {
        System.out.println("                 AUTRE FRAIS");
    }

    public static void autreFrais() {
        Scanner console;
        console = new Scanner(System.in);
        System.out.print("Entrez la Date : ");
        String infoDate = console.nextLine().toLowerCase();
        System.out.print("Entrez le libelle : ");
        String infoLibelle = console.nextLine().toLowerCase();
        System.out.print("Entrez le montant : ");
        String infoMontant = console.nextLine().toLowerCase();
        System.out.println(" | Date | libelle | Montant | ");
        System.out.println(" | " + infoDate + " | " + infoLibelle + " | " + infoMontant + " | ");

    }

    public static void enTete() {
        String titre = "                 ETAT DE FRAIS ENGAGES";
        String info = "A retourner accompagné des justificatifs au plus tard le 10 du mois qui suit l'engagement des frais";
        System.out.println();
        System.out.println(titre);
        System.out.println(info);
    }

    public static void identification() {
        Scanner console;
        System.out.print("visiteur      ");
        console = new Scanner(System.in);
        System.out.print("Matricule : ");
        String matricule = console.nextLine().toUpperCase();
        System.out.print("              Nom : ");
        String nom = console.nextLine().toUpperCase();
        System.out.print("              Mois : ");
        String mois = console.nextLine();
    }

    public static void Condition() {
        System.out.println(
                "1 Les frais doivent être justifiés par une facture acquitté faisant apparaître le montant de la TVA.");
        System.out.print(
                "Ces document ne sont pas à joindre à l'état de frais mais doivent être conservés pendant trois années.");
        System.err.println(" Ils peuvent être contrôlés par le délégué régional ou le service comptable.");
        System.out.println("2 Tarifs en vigueur au 01/09/2010");
        System.out.println("3 Prix au kilomètre selon la puissance du véhicule déclaré auprès des services comptables");
        System.out.println("   * (Véhicule 4CV Diesel) 0.52 €/km");
        System.out.println("   * (Véhicule 5/6CV Diesel) 0.58 €/km");
        System.out.println("   * (Véhicule 4CV Diesel) 0.62 €/km");
        System.out.println("   * (Véhicule 5/6CV Diesel) 0.67 €/km");
        System.out.println(
                "4 Tout frais <hors forfait> doit être dûment justifié par l'envoi d'une facture acquittée faisant apparaître le montant de TVA");
    }

    public static void separateur() {
        for (int i = 0; i < 59; i++) {
            System.out.print("-");
        }

    }

    public static void formulaire() {
        enTete();
        separateur();
        System.out.println();
        identification();
        System.out.println();
        fraisForfait();
        System.out.println();
        phrase();
        autreFrais();
        System.out.println();
        Condition();
    }
}