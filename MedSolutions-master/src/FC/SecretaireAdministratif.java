/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;

public class SecretaireAdministratif extends Utilisateurs {
    private String nom;
    private String prenom;
    private String acces;
    private String mdp;
    private String id;
    
    public SecretaireAdministratif (String nom, String prenom, String mdp,String id) {
        super(nom, prenom, mdp,id);
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.mdp = mdp;
        this.acces="ADMINISTRATIVE";// Permet de definir les droits d’acces à l’application ( en mode des fonctionnalités restreintes quoi ) Supposons on 
        //a une fonctionnalité "gestion des DMA", l'acces va vérifier si c'est bien ADMINISTRATIVe, si c le cas l'acces est autorisé, sinon non

        }
    
      public String getAcces() { return acces; }
    
    public String toString() {
        return "Secrétaire administratif " + prenom + " " + nom + "; " + acces;
        }
    
}

