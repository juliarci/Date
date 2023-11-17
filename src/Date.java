public class Date {

    private int jour;
    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.TestDate();
    }

    public void TestDate(){
        if (jour <1 || jour>31){
            this.setJour(1);
        }
        if (mois<1 || mois>12) {
            this.setMois(1);
        }
        this.TestMois();
        if (mois ==2){
            if(annee%4==0 && annee%100==0){
                System.out.println("L'année est bissextile");
                if (jour>28) this.setJour(1);
        }else {
                System.out.println("L'année n'est pas bissextile");
                if (jour>29) this.setJour(1);
            }
        }
    }
    public void TestMois(){
        if(mois == 4 || mois == 6 || mois == 9|| mois == 11){
            if(jour>30) this.setJour(1);
        }
        if(mois == 1 || mois == 3 || mois == 5|| mois == 7 || mois == 8 || mois == 10 || mois == 12){
            if(jour>31) this.setJour(1);
        }
    }

    @Override
    public String toString() {
        String date = null;
        if(jour>10 && mois>10) date = "Date{" + jour + "/" + mois + "/" + annee + '}';
        if(jour<10) date= "Date{0" + jour + "/" + mois + "/" + annee + '}';
        if(mois<10) date= "Date{" + jour + "/0" + mois + "/" + annee + '}';
        if(mois<10 && jour<10) date= "Date{0" + jour + "/0" + mois + "/" + annee + '}';
        return date;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
