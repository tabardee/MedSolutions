package FC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pauli
 */
public class Utilisateurs { //Est-ce qu'il faudrait créer une sous classe provate Secrétaire pour départager secrétaire médical et administratif?
    String nom;
    String prenom;
    String mdp; 
    String id; 
    
    // permet de définir les mots de passe, identifiants et métiers du personnel (medecin et secretaire administrative et medicale)
    public Utilisateurs (String nom, String prenom, String id, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.id=id;
        this.mdp=mdp; 
    }
    //permet de recuperer la chaine de caractère representant le metier de chaque personnel  de l’hopital en fonction de l’ instance des objets
    public String getMetier (){
        if(this instanceof PraticienHospitalier){ //instanceof teste si un objet ici le métier est une instance d'une classe. Il permet de déterminer si un objet est du même type ou dérive d'un certain type.
            return "PRATICIEN HOSPITALIER";
        }
        else if (this instanceof SecretaireAdministratif){
            return "SECRETAIRE ADMINISTRATIF";
        }
        else {
            return "SECRETAIRE MEDICALE"; //Créer secrétaire médical
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMdp() {
        return mdp;
    }

    public String getId() {
        return id;
    }

    
}
