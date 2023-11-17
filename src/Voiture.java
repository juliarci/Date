public class Voiture {

    private String couleur;
    private int vitesse;
    private String direction;
    private int quantite;

    private Date miseEnService;
    private Date controleTechnique;

    public Voiture(String couleur, int vitesse, String direction, int quantite, Date miseEnService, Date controleTechnique) {
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.direction = direction;
        this.quantite = quantite;
        this.miseEnService = miseEnService;
        this.controleTechnique = controleTechnique;
    }

    public Voiture(String couleur, int vitesse, String direction, int quantite) {
        this.couleur = couleur;
        this.vitesse = vitesse;
        this.direction = direction;
        this.quantite = quantite;
    }

    public Voiture() {
    }

    public void demarre() {
        this.setVitesse(10);
        System.out.println("La voiture démarre à " + vitesse + " k/m");
    }

    public void arret() {
        this.setVitesse(0);
        System.out.println("La voiture s'arrête");
    }

    public void accelere() {
        this.vitesse = vitesse + 10;
        System.out.println("La voiture roule maintenant à " + vitesse + " k/m");
    }

    public void freine() {
        this.vitesse = vitesse - 10;
        System.out.println("La voiture roule maintenant à " + vitesse + " k/m");
    }

    //Evalue la nécessité d'un CT en fonction de l'année en cours donnée en paramtre
    public void evalueCT(Date date) {
        System.out.println("On est en "+date.getAnnee());
        if (this.miseEnService.getAnnee() <= this.controleTechnique.getAnnee() + 4 || this.controleTechnique.getAnnee() <= date.getAnnee() + 2) {
           if(this.miseEnService.getMois()<= this.controleTechnique.getMois() || this.controleTechnique.getMois() <= date.getMois() ){
               if(this.miseEnService.getJour()<= this.controleTechnique.getJour() || this.controleTechnique.getJour() <= date.getJour())
                   System.out.println("La voiture nécessite un contrôle technique");
           }
        } else {
            System.out.println("La voiture ne nécessite pas un contrôle technique");
        }
    }

    @Override
    public String toString() {
        return "Caractéristiques de la voiture {" +
                "couleur='" + couleur + '\'' +
                ", vitesse=" + vitesse +
                ", direction='" + direction + '\'' +
                ", quantite=" + quantite +
                ", miseEnService=" + miseEnService +
                ", controleTechnique=" + controleTechnique +
                '}';
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Date getMiseEnService() {
        return miseEnService;
    }

    public void setMiseEnService(Date miseEnService) {
        this.miseEnService = miseEnService;
    }

    public Date getControleTechnique() {
        return controleTechnique;
    }

    public void setControleTechnique(Date controleTechnique) {
        this.controleTechnique = controleTechnique;
    }
}
