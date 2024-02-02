/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;

public enum Metiers {
    CARDIOLOGUE("cardiologue"),
    UROLOGUE("urologue"),
    GYNECOLOGUE("gynecologue"),
    DERMATOLOGUE("dermatologue"),
    PSYCHIATRE("psychiatre"),
    RADIOLOGUE("radiologue"),
    ANAPATHOLOGUE("anapathologue"),
    HEMATOLOGUE("hematologue"),
    ANESTHESISTE("anesthesiste"),
    INTERNE("interne"),
    INFIRMIER("infirmier"),
    CHIRURGIEN("chirurgien"),
    OPHTALMOLOGUE("ophtalmologue"),
    URGENTISTE("urgentiste"),
    PEDIATRE("pediatre"),
    AMBULANCIER("ambulancier"),
    PHARMACIEN("pharmacien"),
    SECRETAIRE_MEDICAL("secretaire medical"),
    SECRETAIRE_ADMINISTRATIF("secretaire administratif");
    
    private String metier;
/**
 * Constructeur de Fonction
 * @param metier represente le metier du praticien hospitalier 
 */
    Metiers(String metier) {
        this.metier = metier;
    }

/**
 * 
 * @return la fonction
 */
    public String getMetier() {
        return metier;
    }
    

}