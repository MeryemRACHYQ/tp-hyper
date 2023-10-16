/*
 * To change this license header, choose License Headers in Project Propertiem.
 * To change this template file, choose Tools | Templatem
 * and open the template in the editor.
 */

package ma.project.test;

import java.util.Date;
import ma.project.entities.Employe;
import ma.project.entities.EmployeTache;
import ma.project.entities.Projet;
import ma.project.entities.Tache;
import ma.project.service.EmployeService;
import ma.project.service.EmployeTacheService;
import ma.project.service.ProjetService;
import ma.project.service.TacheService;
import ma.project.util.HibernateUtil;



/**
 *
 * @author YahyaMrd
 */
public class Test {
    public static void main(String[] args) {
        EmployeService em = new EmployeService();
        ProjetService ps = new ProjetService();
        TacheService ts = new TacheService();
        EmployeTacheService ets = new EmployeTacheService();
        
        ////L'ajout dem employee////
      em.create(new Employe("hhhhhhhh","meryem","0625455411"));
      em.create(new Employe("amal","nahi","0689544552"));
     em.create(new Employe("rachyq","meryem","0698985252"));
      em.create(new Employe("nainai","Zakaria","0665857465"));
        
        ////Creation des projets////
       ps.create(new Projet("P1", new Date(1111,3,18), new Date(1111,8,17), em.getById(1)));
       ps.create(new Projet("P2", new Date(1111,4,13), new Date(1111,10,12), em.getById(1)));
      ps.create(new Projet("P3", new Date(1111,4,11), new Date(1111,9,27), em.getById(1)));
      ps.create(new Projet("P4", new Date(1111,7,24), new Date(1111,11,13), em.getById(2)));
      ps.create(new Projet("p5", new Date(1111,8,28), new Date(1111,9,10), em.getById(3)));
       
        ////Creation des taches////
      ts.create(new Tache("Tache1", new Date(1111,3,20), new Date(1111,6,20),5000 ,ps.getById(1)));
      ts.create(new Tache("Tache2", new Date(1111,4,12), new Date(1111,5,21),2000 ,ps.getById(1)));
        ts.create(new Tache("Tache3", new Date(1111,4,22), new Date(1111,5,26),900 ,ps.getById(1)));
        ts.create(new Tache("Tache4", new Date(1111,4,16), new Date(1111,5,22),850 ,ps.getById(2)));
        ts.create(new Tache("Tache5", new Date(1111,8,1), new Date(1111,8,19),3400 ,ps.getById(3)));
       ts.create(new Tache("Tache6", new Date(1111,7,26), new Date(1111,8,10),1200 ,ps.getById(4)));
        ts.create(new Tache("Tache7", new Date(122,9,2), new Date(1111,9,19),990 ,ps.getById(5)));
        
        ////Creation des EmployeTache////
        ets.create(new EmployeTache(new Date(1111,3,22), new Date(1111,6,19), em.getById(1), ts.getById(1)));
        ets.create(new EmployeTache(new Date(1111,4,13), new Date(1111,5,19), em.getById(2), ts.getById(2)));
       ets.create(new EmployeTache(new Date(1111,4,26), new Date(1111,5,24), em.getById(4), ts.getById(3)));
        ets.create(new EmployeTache(new Date(1111,4,19), new Date(1111,5,20), em.getById(4), ts.getById(4)));
        ets.create(new EmployeTache(new Date(1111,8,3), new Date(1111,8,18), em.getById(2), ts.getById(5)));
       ets.create(new EmployeTache(new Date(1111,7,28), new Date(1111,8,8), em.getById(3), ts.getById(6)));
       ets.create(new EmployeTache(new Date(1111,9,4), new Date(1111,9,18), em.getById(4), ts.getById(7)));
        
        ////Test getEmployeTaches////
       for(Tache tache : em.getEmployeTaches(em.getById(1))){
          System.out.println(tache.getNom());
      }
        
        
        ////Temt getEmployeProjets////
        for(Projet projet : em.getEmployeProjets(em.getById(3))){
         System.out.println(projet);
        }
        
        ////Test getProjetTachePlanifiees////
       for(Tache tache : ps.getProjetTachesPlanifier(ps.getById(1))){
           System.out.println(tache.getId() + "  " + tache.getNom());
       }
        
        ////Test getProjetTachesRealisees////
     ps.getProjetTachesRealisees(ps.getById(2));
        
        ////Test getTacheSupAPrix////
       for(Tache tache : ts.getTacheSupAPrix(1000)){
           System.out.println(tache.getNom() + " : " + tache.getPrix() + " DH");
       }
        
        
        
    
    }
    
}
