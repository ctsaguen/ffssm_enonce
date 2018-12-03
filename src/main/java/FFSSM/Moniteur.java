/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.ArrayList;

public class Moniteur extends Personne {

    public int numeroDiplome;
    public ArrayList<Embauche> listeEmbauche = new ArrayList<Embauche>();

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.numeroDiplome = numeroDiplome;
    }

    public Club employeur() {
         Embauche e = listeEmbauche.get(listeEmbauche.size()-1);
         return e.getEmployeur();
    }
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {   
         Embauche e = new Embauche(debutNouvelle, this, employeur);
         listeEmbauche.add(e);
    }

    public ArrayList<Embauche> emplois() {
         return listeEmbauche;
    }

}
