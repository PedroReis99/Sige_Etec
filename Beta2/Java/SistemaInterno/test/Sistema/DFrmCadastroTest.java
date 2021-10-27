/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

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
public class DFrmCadastroTest {
    
    public DFrmCadastroTest() {
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
     * Test of Cadastrar method, of class DFrmCadastro.
     */
    @Test
    public void testCadastrar() {
        System.out.println("Cadastrar");
        DFrmCadastro instance = new DFrmCadastro();
        instance.Cadastrar();
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpar method, of class DFrmCadastro.
     */
    @Test
    public void testLimpar() {
        System.out.println("Limpar");
        DFrmCadastro instance = new DFrmCadastro();
        instance.Limpar();
        fail("The test case is a prototype.");
    }

    /**
     * Test of Email method, of class DFrmCadastro.
     */
    @Test
    public void testEmail() {
        System.out.println("Email");
        DFrmCadastro instance = new DFrmCadastro();
        instance.Email();
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class DFrmCadastro.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DFrmCadastro.main(args);
        fail("The test case is a prototype.");
    }
    
}
