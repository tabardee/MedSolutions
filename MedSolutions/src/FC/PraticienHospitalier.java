/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;

public class PraticienHospitalier extends Utilisateurs{
    private String nom;
    private String prenom;
    private Metiers metier;
    private String telephone;

    public PraticienHospitalier(String nom, String prenom, Metiers metier, String telephone, String id, String mdp) {
        super(nom, prenom,id,mdp); 
        this.nom = nom;
        this.prenom = prenom;
        this.metier = metier;
        this.telephone = telephone;
     
    }

    public String getId() {
        return id;
    }

    public Metiers getFonction() {
        return metier;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom() {
        this.prenom=prenom;
    }

    public void setTelephone() {
        this.telephone=telephone; 
    }
    
    public String getTelephone() {
        return telephone;
    }

    public String getMdp() {
        return mdp;
    }
    
    public void setMdp() {
        this.mdp=mdp; 
    }

    public String toString() {
        return "Praticien Hospitalier " + prenom + " " + nom + "; " + metier + "; " + telephone;
    }
}