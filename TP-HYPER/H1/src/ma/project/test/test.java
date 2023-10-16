/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.util.Date;
import ma.produit.entity.Produit;
import ma.projet.service.ProduitService;

/**
 *
 * @author 2020
 */
public class test {
  
     public static void main(String[] args) {
          ProduitService pr = new ProduitService();
          pr.create(new Produit("m1","rf1",new Date(),19.5,"des1"));
           pr.create(new Produit("m2","rf2",new Date(),21.5,"des2"));
            pr.create(new Produit("m3","rf3",new Date(),22.5,"des3"));
             pr.create(new Produit("m4","rf4",new Date(),23.5,"des4"));
              pr.create(new Produit("m5","rf5",new Date(),25.5,"des1"));
              
          for(Produit p : pr.findAll())
            System.out.println(p);
              Produit p = pr.findById(2);
              System.out.println(p);
              Produit p3 = pr.findById(3);
           pr.delete(p3);
           Produit p1 = pr.findById(1);
           p1.setMarque("Decathlon");
           p1.setReference("JH231");
           p1.setDateAchat(new Date());
           p1.setPrix(100.5);
          pr.update(p1);
           
            
           
}
}
