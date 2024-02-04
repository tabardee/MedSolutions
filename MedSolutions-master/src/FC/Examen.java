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
public class Examen {

    private int numArchives;
    private String nomExamen;
    private Patient patient;
    private String observationPraticienHospitalier;
    private TypeExamen type;
    private DateVenue dateVenue;

    public Examen(int numArchives, String nomExamen, Patient patient, String observationPraticienHospitalier, TypeExamen type, DateVenue dateVenue) {

        this.numArchives = numArchives;
        this.patient = patient;
        this.nomExamen = nomExamen;
        this.observationPraticienHospitalier = observationPraticienHospitalier;
        this.type = type;
        this.dateVenue = dateVenue;
    }

    public String toString() {
        return ", nom : " + getNomExamen() + " de type : " + getType().toString() + "," + "Observation réalisée :" + getObservationPraticienHospitalier() + "le :" + getDate().toString();
    }

    public String getNomExamen() {
        return nomExamen;
    }

    public void setNom(String nomExamen) {
        this.nomExamen = nomExamen;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public String getObservationPraticienHospitalier() {
        return observationPraticienHospitalier;
    }

    public void setObservationPraticienHospitalier(String observationPraticienHospitalier) {
        this.observationPraticienHospitalier = observationPraticienHospitalier;
    }

    public TypeExamen getType() {
        return type;
    }

    public void setType(TypeExamen type) {
        this.type = type;
    }

    public DateVenue getDate() {
        return dateVenue;
    }

    public void setDate(DateVenue date) {
        this.dateVenue = date;
    }
}

