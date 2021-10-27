/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.AlunoBean;
import java.sql.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
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
public class ControleAlunoTest {
    
    public ControleAlunoTest() {
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
     * Test of Adicionar method, of class ControleAluno.
     */
    @Test
    public void testAdicionar() {
        System.out.println("Adicionar");
        String ra = "159962";
        String nome = "Teste Junit";
        String rg = "123456789";
        String genero = "Masculino";
        Date DtNasc = null;
        String serie = "Berçario";
        String Caminho = "";
        String Periodo = "Tarde";
        String escola = "1";
        ControleAluno instance = new ControleAluno();
        instance.Adicionar(ra, nome, rg, genero, DtNasc, serie, Caminho, Periodo, escola);
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class ControleAluno.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        AlunoBean ab = null;
        ControleAluno instance = new ControleAluno();
        instance.Update(ab);
        fail("The test case is a prototype.");
    }
    @Test
    public void testTransferencia() {
        System.out.println("transferencia");
        AlunoBean ab = null;
        ControleAluno instance = new ControleAluno();
        instance.transferencia(ab);
        fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaTransferencia method, of class ControleAluno.
     */
    @Test
    public void testPesquisaTransferencia() {
        System.out.println("PesquisaTransferencia");
        AlunoBean ab = null;
        ControleAluno instance = new ControleAluno();
        instance.PesquisaTransferencia(ab);
        fail("The test case is a prototype.");
    }

    /**
     * Test of PesquisaSolicitacao method, of class ControleAluno.
     */
    @Test
    public void testPesquisaSolicitacao() {
        System.out.println("PesquisaSolicitacao");
        AlunoBean ab = null;
        ControleAluno instance = new ControleAluno();
        instance.PesquisaSolicitacao(ab);
        fail("The test case is a prototype.");
    }

}
