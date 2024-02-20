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
public enum TypeExamen {

    DIAGNOSTIQUE("diagnostique"),
    ABLATION("ablation"),
    ENDOSCOPIE("endoscopique"),
    CHIRURGIE("chirurgical"),
    POSE("pose"),
    BIOPSIE("biopsie"),
    COLOSCOPIE("coloscopique"),
    ELECTROCARDIOGRAMME("electrocardiogramme"),
    HEMOGRAMME("hemogramme"),
    IRM("IRM"),
    MAMMOGRAPHIE("mammographie"),
    SCANNER("scanner"),
    RADIOGRAPHIE("radiographie"),
    BILAN_SANGUIN("bilan sanguin"),
    URETEROSCOPIE("ureteroscopie"),
    VASECTOMIE("vasectomie"),
    THERAPEUTIQUE("thérapeutique");
    

    private String nom;

    private TypeExamen(String nom) {
        this.nom = nom;
    }
}
