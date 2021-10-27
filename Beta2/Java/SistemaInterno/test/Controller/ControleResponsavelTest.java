/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.ResponsavelBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class ControleResponsavelTest {
    
    public ControleResponsavelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Adicionar method, of class ControleResponsavel.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        String pai = "Jose";
        String Cpfpai = "30284298";
        String mae = "Josefa";
        String cpfMae = "2842984";
        String aluno = "1";
        ControleResponsavel instance = new ControleResponsavel();
        instance.Adicionar(pai, Cpfpai, mae, cpfMae, aluno);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaResponsveis method, of class ControleResponsavel.
     */
    @Test
    public void testPesquisaResponsveis() {
        String ra = "1";
        ResponsavelBean rb = new ResponsavelBean();
        rb.setFk_aluno1(ra);
        
    }
    
}
