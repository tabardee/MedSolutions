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
public enum Service {
    CARDIOLOGIE("cardiologie"),
    UROLOGIE("urologie"),
    GYNECOLOGIE("gynecologie"),
    DERMATOLOGIE("dermatologie"),
    PSYCHIATRIE("psychiatrie"),
    RADIOLOGIE("radiologie"),
    ANAPATHOLOGIE("anapathologie"),
    HEMATOLOGIE("hematologie"),
    ANESTHESIE("anesthesie"),
    REANIMATION ("reanimation"),
    INTERNE("interne"),
    ORTHOPEDIE("orthopedie"),
    CHIRURGIE("chirurgie"),
    OPHTALMOLOGIE("ophtalmologie"),
    URGENTISTE("urgentiste"),
    PEDIATRIE("pediatrie"),
    PHARMACIE("pharmacie");
    
    private String service;
/**
 * Constructeur de Fonction
 * @param metier represente le metier du praticien hospitalier 
 */
    Service(String service) {
        this.service = service;
    }

/**
 * 
 * @return la fonction
 */
    public String getService() {
        return service;
    }
    

    
}
