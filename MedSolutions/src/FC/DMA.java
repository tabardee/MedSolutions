/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pauli
 */
public class DMA {

    private ArrayList Consultation = new ArrayList();
    private ArrayList Hospitalisation = new ArrayList();
    private ArrayList lettresortie = new ArrayList();//lettre de sortie rédigée par ce PH
    private String prenom;
    private String nom;
    private Date dateNaissance;
    private String ippSecretaireAdm;
    private String service;//DMA accessible par PH QUE si patient admis dans son service
    private int numeroSejour;//format YYMMxxxxx compteur de 5
    private Date dateCreationDMAs;
    private String nomPHrespo;//nom du praticien hospitalier responsable
    private String natureMedicoTech;//Nature prestations médico-technique mais PAS leur résultats

}
