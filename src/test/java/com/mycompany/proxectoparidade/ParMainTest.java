package com.mycompany.proxectoparidade;

import com.mycompany.proxectoparidade.ParMain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Manuel
 */
public class ParMainTest {
    
    public ParMainTest() {
    }

    /**
     * Test of main method, of class ParMain.
     */
    @Disabled
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarParidade method, of class ParMain.
     */
    @Test
    public void testComprobarParidadeCero() {
        System.out.println("comprobarParidadeCero");
        int numeroProba = 0;
        String resultadoEsperado = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void testComprobarParidadeParPositivo() {
        System.out.println("comprobarParidadeParPositivo");
        int numeroProba = 16;
        String resultadoEsperado = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void testComprobarParidadeImparPositivo() {
        System.out.println("comprobarParidadeImparPositivo");
        int numeroProba = 25;
        String resultadoEsperado = "O número é impar";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void testComprobarParidadeParNegativo() {
        System.out.println("comprobarParidadeParNegativo");
        int numeroProba = -6;
        String resultadoEsperado = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }
    
    @Test
    public void testComprobarParidadeImparNegativo() {
        System.out.println("comprobarParidadeImparNegativo");
        int numeroProba = -15;
        String resultadoEsperado = "O número é impar";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }  

    /**
     * Test of verificaPar method, of class ParMain.
     */
    @Test
    public void testVerificaParCero() {
        System.out.println("verificaParCero");
        int numeroProba = 0;
        assertTrue(ParMain.verificaPar(numeroProba));
    }
    
    @Test
    public void testVerificaParNumPar() {
        System.out.println("verificaParNumPar");
        int numeroProba = 10;
        assertTrue(ParMain.verificaPar(numeroProba));
    }
    
    @Test
    public void testVerificaParNumImpar() {
        System.out.println("verificaParNumImpar");
        int numeroProba = 11;
        assertFalse(ParMain.verificaPar(numeroProba));
    }
     
}
