package FFSSM;

import java.util.Calendar;
import java.util.ArrayList;
public class Plongeur extends Personne{
    public int niveau;
    ArrayList<Licence> listeLicence = new ArrayList<>();
    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int niveau){
	super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau = niveau;
    }
    
    public void ajouteLicence(Licence l ){
        listeLicence.add(l);
    }
    
    public Licence getLicenceActuel(){
       return listeLicence.get(listeLicence.size()-1);
    }
  
}
