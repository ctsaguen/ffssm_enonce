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
public class MoniteurTest {
    
    Moniteur moniteur = new Moniteur("1zertu","tsague","kevin","16 rue des Capucins","695833965",Calendar.getInstance(),4232);
     
    public MoniteurTest() {
    }
    /**
     * Test of employeur method, of class Moniteur.
     */
    @Test
    public void testEmployeur() {
        System.out.println("employeur");
        Club club1 = null;
        moniteur.nouvelleEmbauche(club1, Calendar.getInstance());
        Club club2 = null;
        moniteur.nouvelleEmbauche(club2, Calendar.getInstance());
        Club result = moniteur.employeur();
        assertEquals(club2, result);
        
    }
    
}
