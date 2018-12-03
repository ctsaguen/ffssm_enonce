/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.util.ArrayList;
import java.util.Calendar;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public Calendar date;

    public int profondeur;

    public int duree;
    
    public ArrayList<Plongeur> listeParticipant = new ArrayList<>();

    public Plongee(Site lieu, Moniteur chefDePalanquee, Calendar date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
    }

    public void ajouteParticipant(Plongeur participant) {
         listeParticipant.add(participant);
    }

    public Calendar getDate() {
        return date;
    }

    public boolean estConforme() {
         boolean i = true ; 
         for(Plongeur p : listeParticipant){
            if(p.getLicenceActuel().estValide(date)){
                i = p.getLicenceActuel().estValide(date);
            }
         }
         return i ; 
    }

}
