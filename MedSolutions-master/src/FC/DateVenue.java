/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;

/**
 *
 * @author pauli
 */
public class DateVenue { //jour, mois, année, heure, minute, set et get
    private int jour;
    private int mois;
    private int annee;
    private int heure;
    private int minutes;
    
    public DateVenue(int annee, int mois, int jour,int heure, int minutes) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.heure=heure;
        this.minutes=minutes;
        }

        public DateVenue(int annee, int mois, int jour){
        this.annee = annee;
        this.mois= mois;
        this.jour= jour;
    }

    /**
     * @return the jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * @param jour the jour to set
     */
    public void setJour(int jour) {
        this.jour = jour;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @param mois the mois to set
     */
    public void setMois(int mois) {
        this.mois = mois;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return the heure
     */
    public int getHeure() {
        return heure;
    }

    /**
     * @param heure the heure to set
     */
    public void setHeure(int heure) {
        this.heure = heure;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
     public String toString() { //Permet d'écrire au bon format jj/mm/aa/ hh : mm
        if (getMois() < 10 && getJour() < 10 && getHeure() < 10 && getMinutes() < 10) {
            return getAnnee() + "-0" + getMois() + "-0" + getJour() + " 0" + getHeure() + ":0" + getMinutes();
        }
        if (getMois() >= 10 && getJour() < 10 && getHeure() < 10 && getMinutes() < 10) {
            return getAnnee() + "-" + getMois() + "-0" + getJour() + " 0" + getHeure() + ":0" + getMinutes();
        }
        if (getMois() >= 10 && getJour() >= 10 && getHeure() < 10 && getMinutes() < 10) {
            return getAnnee() + "-" + getMois() + "-" + getJour() + " 0" + getHeure() + ":0" + getMinutes();
        }
        if (getMois() >= 10 && getJour() >= 10 && getHeure() >= 10 && getMinutes() < 10) {
            return getAnnee() + "-" + getMois() + "-" + getJour() + " " + getHeure() + ":0" + getMinutes();
        }
        if (getMois() >= 10 && getJour() < 10 && getHeure() >= 10 && getMinutes() < 10) {
            return getAnnee() + "-" + getMois() + "-0" + getJour() + " " + getHeure() + ":0" + getMinutes();
        }
        if (getMois() >= 10 && getJour() < 10 && getHeure() >= 10 && getMinutes() >= 10) {
            return getAnnee() + "-" + getMois() + "-0" + getJour() + " " + getHeure() + ":" + getMinutes();
        }
        if (getMois() < 10 && getJour() >= 10 && getHeure() < 10 && getMinutes() < 10) {
            return getAnnee() + "-0" + getMois() + "-" + getJour() + " 0" + getHeure() + ":0" + getMinutes();
        }
        if (getMois() < 10 && getJour() >= 10 && getHeure() >= 10 && getMinutes() < 10) {
            return getAnnee() + "-0" + getMois() + "-" + getJour() + " " + getHeure() + ":0" + getMinutes();
        }
        if (getMois() < 10 && getJour() >= 10 && getHeure() >= 10 && getMinutes() >= 10) {
            return getAnnee() + "-0" + getMois() + "-" + getJour() + " " + getHeure() + ":" + getMinutes();
        }
        if (getMois() < 10 && getJour() < 10 && getHeure() >= 10 && getMinutes() >= 10) {
            return getAnnee() + "-0" + getMois() + "-0" + getJour() + " " + getHeure() + ":" + getMinutes();
        }
        if (getMois() < 10 && getJour() >= 10 && getHeure() < 10 && getMinutes() >= 10) {
            return getAnnee() + "-0" + getMois() + "-" + getJour() + " 0" + getHeure() + ":" + getMinutes();
        }
        if (getMois() >= 10 && getJour() >= 10 && getHeure() < 10 && getMinutes() >= 10) {
            return getAnnee() + "-" + getMois() + "-" + getJour() + " 0" + getHeure() + ":" + getMinutes();
        }
        if (getMois() < 10 && getJour() < 10 && getHeure() >= 10 && getMinutes() < 10) {
            return getAnnee() + "-0" + getMois() + "-0" + getJour() + " " + getHeure() + ":0" + getMinutes();
        }
        if (getMois() < 10 && getJour() < 10 && getHeure() < 10 && getMinutes() >= 10) {
            return getAnnee() + "-0" + getMois() + "-0" + getJour() + " 0" + getHeure() + ":0" + getMinutes();
        }
        return getAnnee() + "-" + getMois() + "-" + getJour() + " " + getHeure() + ":" + getMinutes();

        }
    
}
