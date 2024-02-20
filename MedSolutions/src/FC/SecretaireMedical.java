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
public class SecretaireMedical extends Utilisateurs {
       private String nom;
    private String prenom;
    private String mdp;
    private String id;
    
    public SecretaireMedical (String nom, String prenom, String mdp,String id) {
        super(nom, prenom, mdp,id);
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.mdp = mdp;
        }
    
    
    public String toString() {
        return "Secrétaire administratif " + getPrenom() + " " + getNom() ;
        }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
}
