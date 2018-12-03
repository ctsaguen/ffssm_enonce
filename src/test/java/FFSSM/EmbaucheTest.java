/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSM;

import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class EmbaucheTest {
    Moniteur moniteur;
    Club club;
    Embauche embauche = new Embauche(Calendar.getInstance(),moniteur, club);
    
    public EmbaucheTest() {
    }

    /**
     * Test of terminer method, of class Embauche.
     */
    @Test
    public void testTerminer() {
        System.out.println("terminer");
        Calendar dateFin = Calendar.getInstance();
        embauche.terminer(dateFin);
        assertEquals(embauche.getFin(),dateFin);
    }

    /**
     * Test of estTerminee method, of class Embauche.
     */
    @Test
    public void testEstTerminee() {
        System.out.println("estTerminee");
        embauche.terminer(Calendar.getInstance());
        assertTrue(embauche.estTerminee());
       
    }

    /**
     * Test of getEmployeur method, of class Embauche.
     */
    @Test
    public void testGetEmployeur() {
        System.out.println("getEmployeur");
        Club result = embauche.getEmployeur();
        assertEquals(club, result);
    }

    /**
     * Test of getEmploye method, of class Embauche.
     */
    @Test
    public void testGetEmploye() {
        System.out.println("getEmploye");
        Moniteur result = embauche.getEmploye();
        assertEquals(moniteur, result);
    }

    /**
     * Test of getFin method, of class Embauche.
     */
    @Test
    public void testGetFin() {
        System.out.println("getFin");
        embauche.terminer(Calendar.getInstance());
        Calendar expResult = Calendar.getInstance();
        Calendar result = embauche.getFin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFin method, of class Embauche.
     */
    @Test
    public void testSetFin() {
        System.out.println("setFin");
        Calendar fin = Calendar.getInstance();
        embauche.setFin(fin);
        assertEquals(embauche.getFin(),fin);
    }

    /**
     * Test of getDebut method, of class Embauche.
     */
    @Test
    public void testGetDebut() {
        System.out.println("getDebut");
        Calendar expResult = Calendar.getInstance();
        Calendar result = embauche.getDebut();
        assertEquals(expResult, result);
    }
    
}
