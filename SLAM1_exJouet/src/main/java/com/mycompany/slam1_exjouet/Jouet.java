/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slam1_exjouet;

/**
 *
 * @author erwan
 */
public class Jouet {
    private String nom;
    private String matiere;
    private int prix;
    private int categorie;
    
    // constructeur 
    public Jouet(String nom, String matiere, int prix, int categorie) {
        this.nom = nom;
        this.matiere = matiere;
        this.prix = prix;
        this.categorie = categorie;
    }

    // autres méthodes
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public String getPublic()
    {
        if(this.categorie == 1)
            return "Bébé";
        if(this.categorie == 2)
            return "Enfants";
        if(this.categorie == 3)
            return "Ado";
        return "Adulte";
    }

    public String affEtat() {
        return "Jouet{" + "nom=" + nom + ", matiere=" + matiere + ", prix=" + prix + ", categorie=" + categorie + '}';
    }
    
    
}
