/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSM;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class ClubTest {
    Moniteur president = new Moniteur("1zertu","tsague","kevin","16 rue des Capucins","695833965",Calendar.getInstance(),4232);
    Club club = new Club(president,"club1","69875498");
    
    public ClubTest() {
        club.setAdresse("31 avenue jear");
        club.setTelephone("675435566");
    }
    /**
     * Test of ajouterPlongerFalse method, of class Club.
     */
    @Test
    public void testAjouterPlongerFalse() {
        System.out.println("ajouterPlongerFalse");
        club.ajouterPlongerFalse();
    }

    /**
     * Test of organisePlongee method, of class Club.
     */
    @Test
    public void testOrganisePlongee() {
        System.out.println("organisePlongee");
        Plongee p = null;
        club.organisePlongee(p);
        assertNotNull(club.listeDesPlongeeOrganise);
    }

    /**
     * Test of getPresident method, of class Club.
     */
    @Test
    public void testGetPresident() {
        System.out.println("getPresident");
        Moniteur result = club.getPresident();
        assertEquals(president, result);
    }

    /**
     * Test of setPresident method, of class Club.
     */
    @Test
    public void testSetPresident() {
        System.out.println("setPresident");
        Moniteur moniteur = new Moniteur("2zertu","pecasi","junior","12 rue des Capucins","6958323965",Calendar.getInstance(),234);
        club.setPresident(moniteur);
        assertEquals(club.getPresident(),moniteur);
    }

    /**
     * Test of getNom method, of class Club.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "club1";
        String result = club.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Club.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "clubfc";
        club.setNom(nom);
        assertEquals(nom,club.getNom());
    }

    /**
     * Test of setAdresse method, of class Club.
     */
    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        String adresse = "13 avenue king";
        club.setAdresse(adresse);
        assertEquals(club.getAdresse(),adresse);
    }
    
    /**
     * Test of getAdresse method, of class Club.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        String expResult = "31 avenue jear";
        String result = club.getAdresse();
        assertEquals(result,expResult);
    }
    
    /**
     * Test of setTelephone method, of class Club.
     */
    @Test
    public void testSetTelephone() {
        System.out.println("setTelephone");
        String telephone = "675435566";
        club.setTelephone(telephone);
        assertEquals(club.getTelephone(),telephone);
    }

    /**
     * Test of getTelephone method, of class Club.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        String expResult = "675435566";
        String result = club.getTelephone();
        assertEquals(result,expResult);
        
    }
    
}
