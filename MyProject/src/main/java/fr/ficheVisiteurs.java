package fr;

public class ficheVisiteurs {

    public static void main(String[] arg) {
        enTete();
        separateur();
        System.out.println();
        identification();
        System.out.println();
        Condition();
    }

    public static void enTete() {
        String titre = "                 ETAT DE FRAIS ENGAGES";
        String info = "A retourner accompagné des justificatifs au plus tard le 10 du mois qui suit l'engagement des frais";
        System.out.println();
        System.out.println(titre);
        System.out.println(info);
    }

    public static void identification() {
        String visiteur = "visiteur";
        String matricule = "Matricule";
        String nom = "Nom";
        String mois = "Mois";
        System.out.println(visiteur + "   " + matricule);
        System.out.println("           " + nom);
        System.out.println(mois + "        ");
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
}