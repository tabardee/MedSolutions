/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FC;
    import java.util.Vector;
/**
 *
 * @author pauli
 */
public class FichedeSoin {


public class FicheDeSoins {
    private Patient patient;
    private PraticienHospitalier praticienHospitalier;
    private DateVenue dateVenue;
    private Vector<Examen> examens;       // contient des objets de classe 'Examen'
    private int numFiche;
    
    public FicheDeSoins(Patient patient, PraticienHospitalier praticienHospitalier, DateVenue dateVenue, int numFiche) {
        this.patient = patient;
        this.praticienHospitalier = praticienHospitalier;
        this.dateVenue = dateVenue;
        examens = new Vector<Examen>();   // liste vide
        this.numFiche=numFiche;
        }
    
    public Patient getPatient() { return patient; }
    public PraticienHospitalier getPraticienHospitalier() { return praticienHospitalier; }
    public DateVenue    getDate()    { return dateVenue; }
    public Vector<Examen> getExamen () {return examens;}
    
    public void ajouterExamen(Examen examen) {
        examens.add(examen);
        }
    
    public void supprimerActe(Examen examen){
        examens.remove(examen); 
    }
    
    public void ajouterExamen(int numArchives, String nom,Patient patient, String observationPraticienHospitalier, TypeExamen type, DateVenue dateVenue) { //création
        Examen examen = new Examen (numArchives, nom, patient, observationPraticienHospitalier, type, dateVenue);
        examens.add(examen);
        }
    
    public void afficher() {
        System.out.println("Fiche de soins du " + dateVenue.toString());
        System.out.println("- praticien hospitalier : " + praticienHospitalier.toString());
        System.out.println("- patient : " + patient.toString());
        System.out.println("- actes medicaux :");
        for (int i=0; i<examens.size(); i++) {
            Examen a = examens.get(i);
            System.out.println("    > " + a.toString());
            }
        }
    
    }
    
}
