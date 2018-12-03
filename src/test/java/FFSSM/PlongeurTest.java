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
public class PlongeurTest {
    
    private Plongeur plongeur = new Plongeur("1zertu","tsague","kevin","16 rue des Capucins","695833965",Calendar.getInstance(),4);
    
    private Licence licenceAct;
    
    public PlongeurTest() {
    }
    /**
     * Test of ajouteLicence method, of class Plongeur.
     */
    @Test
    public void testAjouteLicence() {
        System.out.println("ajouteLicence");
        Licence l1 = null;
        plongeur.ajouteLicence(l1);
        Licence l2 = null;
        plongeur.ajouteLicence(l2);
        licenceAct = plongeur.getLicenceActuel();
        assertEquals(l2,licenceAct);
    }
    
}
