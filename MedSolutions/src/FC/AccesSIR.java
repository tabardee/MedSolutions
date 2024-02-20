/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;
import java.util.Date;

/**
 *
 * @author emmat
 */
public class AccesSIR {
    
    private String nomPatient;
    private String prenomPatient;
    private Date dateNaissance;
    private String nomPHrespo;
    private String typeImagerie;
   
   
   
    public AccesSIR (String nomPatient, String prenomPatient, Date dateNaissance, Date date,String nomPHrespo, String typeImagerie) {
        this.nomPatient=nomPatient;
        this.prenomPatient=prenomPatient;
        this.dateNaissance=dateNaissance;
        this.nomPHrespo=nomPHrespo;
        this.typeImagerie=typeImagerie;

        }
}
