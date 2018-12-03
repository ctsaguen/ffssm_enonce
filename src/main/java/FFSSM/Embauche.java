package FFSSM;

import java.util.Calendar;

public class Embauche {

    private Calendar debut;

    private Calendar fin;

    private final Moniteur employe;

    private final Club employeur;

    public Embauche(Calendar debut, Moniteur employe, Club employeur) {
        this.debut = debut;
        this.employe = employe;
        this.employeur = employeur;
    }

    /**
     * Termine cette embauche
     * @param dateFin la date à laquelle cette embauche est terminée
     */
    public void terminer(Calendar dateFin) {
         this.fin = dateFin;    
    }
    
    /**
     * Est-ce que cette embauche est terminée ?
     * @return vrai si terminée, faux sinon.
     */
    public boolean estTerminee() {
        return (fin != null);
    }
    /**
     * Get the value of employeur
     *
     * @return the value of employeur
     */
    public Club getEmployeur() {
        return employeur;
    }

    /**
     * Get the value of employe
     *
     * @return the value of employe
     */
    public Moniteur getEmploye() {
        return employe;
    }

    /**
     * Get the value of fin
     *
     * @return the value of fin
     */
    public Calendar getFin() {
        return fin;
    }

    /**
     * Set the value of fin
     *
     * @param fin new value of fin
     */
    public void setFin(Calendar fin) {
        this.fin = fin;
    }

    /**
     * Get the value of debut
     *
     * @return the value of debut
     */
    public Calendar getDebut() {
        return debut;
    }

    
}
