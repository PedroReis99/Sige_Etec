/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.EnderecoBean;
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
public class ControleEnderecoTest {
    
    public ControleEnderecoTest() {
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
     * Test of Adicionar method, of class ControleEndereco.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        String cidade = "x";
        String estado = "x";
        String bairro = "x";
        String rua = "x";
        String cep = "x";
        String numero = "x";
        String bloco = "x";
        String aluno = "1";
        ControleEndereco instance = new ControleEndereco();
        instance.Adicionar(cidade, estado, bairro, rua, cep, numero, bloco, aluno);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaEndereco method, of class ControleEndereco.
     */
    @Test
    public void testPesquisaEndereco() {
        String ra= "1";
         EnderecoBean eb = new EnderecoBean();
         eb.setFk_aluno3(ra);
        //fail("The test case is a prototype.");
    }
    
}
