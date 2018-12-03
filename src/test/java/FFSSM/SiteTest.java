/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FFSSM;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */
public class SiteTest {
    
    Site site = new Site("site1","site final de construction");
    
    public SiteTest() {
    }

    /**
     * Test of getNom method, of class Site.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        String expResult = "site1";
        String result = site.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Site.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "site Final";
        site.setNom(nom);
        assertEquals(site.getNom(),nom);
    }

    /**
     * Test of getDetails method, of class Site.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        String expResult = "site final de construction";
        String result = site.getDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDetails method, of class Site.
     */
    @Test
    public void testSetDetails() {
        System.out.println("setDetails");
        String details = "ce site vient de changer de details";
        site.setDetails(details);
        assertEquals(site.getDetails(),details);
    }
    
}
