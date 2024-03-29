package com.esatic.cartographieprn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

@Entity
public class Programme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private String domaine;
    private String cible;
    private String organisateur;
    /*private String dateDebut;*/

    // Constructeurs
    public Programme() {
    }

    public Programme(String titre, String description, String domaine, String cible, String organisateur, String dateDebut) {
        this.titre = titre;
        this.description = description;
        this.domaine = domaine;
        this.cible = cible;
        /*this.dateDebut = dateDebut;*/
        this.organisateur = organisateur;
    }

    // Getters et Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getCible() {
        return cible;
    }

    public void setCible(String cible) {
        this.cible = cible;
    }

    /*public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }*/

    public String getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(String dateFin) {
        this.organisateur = organisateur;
    }

    @Override
    public String toString() {
        return "Programme{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", domaine='" + domaine + '\'' +
                ", ressource='" + cible + '\'' +
                ", dateFin='" + organisateur + '\'' +
                '}';
    }

}
