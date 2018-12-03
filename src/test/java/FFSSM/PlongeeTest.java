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
public class PlongeeTest {
   private  Site lieu;
    
    private Moniteur chefPalanquee;
    
    Plongee plongee = new Plongee(lieu,chefPalanquee,Calendar.getInstance(),12,20);
    
    Plongeur p1 = new Plongeur("1zertu","tsague","kevin","16 rue des Capucins","695833965",Calendar.getInstance(),4);
 
    Plongeur p2 = new Plongeur("2zertu","ngou","cedric","11 rue des falinn","699875248",Calendar.getInstance(),5);
    
    public PlongeeTest() {
    }

    /**
     * Test of ajouteParticipant method, of class Plongee.
     */
    @Test
    public void testAjouteParticipant() {
        System.out.println("ajouteParticipant");
        plongee.ajouteParticipant(p1);
        assertNotNull(plongee.listeParticipant);
    }

    /**
     * Test of getDate method, of class Plongee.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        plongee.date = Calendar.getInstance();
        Calendar expResult = Calendar.getInstance();
        assertEquals(plongee.getDate(), expResult);
    }

    /**
     * Test of estConforme method, of class Plongee.
     */
    @Test
    public void testEstConforme() {
        System.out.println("estConforme");
        Licence l1 = new Licence(p1,"12GYU",Calendar.getInstance(),2,null);
        p1.ajouteLicence(l1);
        Licence l2 = new Licence(p1,"1234GYU",Calendar.getInstance(),7,null);
        p2.ajouteLicence(l2);
        plongee.ajouteParticipant(p2);
        assertTrue(plongee.estConforme());      
    }
    
}
