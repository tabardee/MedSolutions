/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medsolutions;
import java.util.Date;

/**
 *
 * @author emmat
 */
public class AccesDMA {
    
    //En tant que praticien hospitalier
//Je veux visualiser les examens
//Dans le but d’avoir une information sur un patient en particulier
//On part du principe que le praticien hospitalier est déjà connecté à son compte
    private String nomPatient;
    private String prenomPatient;
    private Date dateNaissance;
    private String service;
    private int numeroSejour;
    private Date date;
    private String nomPHrespo;
    private String lettrePHrespo;
    private String natureMedicoTech;
   
   
   
    public AccesDMA (String nomPatient, String prenomPatient, Date dateNaissance,String service, int numeroSejour,Date date,String nomPHrespo,String lettrePHrespo, String natureMedicoTech) {
        this.nomPatient=nomPatient;
        this.prenomPatient=prenomPatient;
        this.dateNaissance=dateNaissance;
        this.service=service;
        this.numeroSejour=numeroSejour;
        this.date=date;
        this.nomPHrespo=nomPHrespo;
        this.lettrePHrespo=lettrePHrespo;
        this.natureMedicoTech=natureMedicoTech;
       
       

        }
}
