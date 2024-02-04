/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FC;
import java.awt.List;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author pauli
 */
public class DM {
    private Service service;
    private DateVenue dateVenue;
    private String prenomPatient;
    private String nomPatient;
    private String dateNaissance;
    private String observations;
    //propre au service médico-technique
    private ArrayList resultats;
    private ArrayList PrescriptionsPH = new ArrayList();
    private ArrayList FichedeSoin = new ArrayList();
    private ArrayList Examen = new ArrayList();
    private ArrayList dateSortie = new ArrayList();
    //Pour les opérations, ajouter les noms des infirmiers qui réalisent les opérations
    //Lettre de sortie du PHrespo
    
    public DM (DateVenue dateVenue, String nomPatient, String prenomPatient, String dateNaissance, ArrayList resultats, 
            String observations, ArrayList dateSortie, Service service) {
        
        this.dateVenue=dateVenue;
        this.nomPatient=nomPatient;
        this.prenomPatient=prenomPatient;
        this.dateNaissance=dateNaissance;
        this.resultats=resultats;
        this.observations=observations;
        this.dateSortie=dateSortie;
        this.service=service;
        }

}

//Ajouter ou supprimer resultats, observations, fichesDeSoin