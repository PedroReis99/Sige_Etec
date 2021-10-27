/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.SolicitacaoBean;
import java.util.List;
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
public class ControleSolicitacaoTest {
    
    public ControleSolicitacaoTest() {
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
     * Test of RegistrarSolicitacao method, of class ControleSolicitacao.
     */
    @Test
    public void testRegistrarSolicitacao() {
        System.out.println("RegistrarSolicitacao");
        String Aluno = "785421";
        String Periodo = "Tarde";
        String Serie = "Berçario";
        String Turma = "Turma B";
        String CodigoEscolar = "2";
        String Status = "Ativo";
        ControleSolicitacao instance = new ControleSolicitacao();
        instance.RegistrarSolicitacao(Aluno, Periodo, Serie, Turma, CodigoEscolar, Status);
        fail("The test case is a prototype.");
    }
}
