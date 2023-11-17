import java.util.Scanner;

public class TestVoiture {

    public void creationVoit() {
        Voiture v1 = new Voiture("Bleu", 40, "Droite", 50);
        Voiture v3 = new Voiture("Vert", 60, "Gauche", 100);

        v1.demarre();
        v1.accelere();
        v1.arret();
        v3.accelere();
        v3.freine();
        v3.arret();
    }

    public void creaPlusieursVoit() {
        System.out.println("Entrez le nombre de voiture à créer :");
        Scanner sc1 = new Scanner(System.in);
        int nbr2 = Integer.parseInt(sc1.next());
        for (int i = 0; i <= (nbr2 - 1); i++) {
            System.out.println("Entrez la couleur de la voiture " + (i + 1) + " : ");
            String couleur = sc1.next();
            System.out.println("Entrez la vitesse de la voiture" + (i + 1) + " : ");
            int vitesse = Integer.parseInt(sc1.next());
            System.out.println("Entrez la direction de la voiture " + (i + 1) + " : ");
            String direction = sc1.next();
            System.out.println("Entrez la quantité de carburant de la voiture : ");
            int quantite = Integer.parseInt(sc1.next());
            System.out.println("La date de mise en service de la voiture : ");
            Date miseEnService = this.recupDate();
            System.out.println("Entrez la date de controle technique de la voiture : ");
            Date controle = this.recupDate();
            Voiture v = new Voiture(couleur, vitesse, direction, quantite, miseEnService, controle);
            System.out.println("Entrez l'année actuelle : ");
            Date aujour = this.recupDate();
            v.evalueCT(aujour);
            System.out.println(v.toString());
        }
    }

    public Date recupDate() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Jour : ");
        int jour = Integer.parseInt(sc1.next());
        System.out.println("Mois : ");
        int mois = Integer.parseInt(sc1.next());
        System.out.println("Année : ");
        int annee = Integer.parseInt(sc1.next());
        Date date = new Date(jour, mois, annee);
        return date;
    }
}
