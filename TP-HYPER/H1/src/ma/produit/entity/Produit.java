/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.produit.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
@Entity
@Table(name = "produits")
public class Produit {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "marque")
    private String marque;

    @Column(name = "reference")
    private String reference;

    @Column(name = "dateAchat")
    private Date dateAchat;

    @Column(name = "prix")
    private double prix;

    @Column(name = "designation")
    private String designation;

    public Produit(String marque, String reference, Date dateAchat, double prix, String designation) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.designation = designation;
    }

    

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReference() {
        return reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public String getDesignation() {
        return designation;
    }

    public Produit(int id, String marque, String reference) {
        this.id = id;
        this.marque = marque;
        this.reference = reference;
    }

    public Produit() {
    }

    
    
    
}
