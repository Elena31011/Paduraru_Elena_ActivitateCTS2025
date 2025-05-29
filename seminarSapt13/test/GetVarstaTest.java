package acs.ase.test;

import acs.ase.clase.Persoana;
import acs.ase.exceptii.CNPInexistent;
import acs.ase.exceptii.ExceptieCNPInvalid;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetVarstaTest {

    Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @org.junit.Test
    public void getVarstaRIGHT() {
    persoana = new Persoana("Adrian", "50312283892134");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void getVarstaRIGHT2(){
        persoana = new Persoana("Mirel", "2991212333");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInferior(){
        persoana = new Persoana("Ana", "2991212333");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundarySuperior(){
        persoana = new Persoana("Ana", "6000101330000");
        assertEquals(25, persoana.getVarsta());
    }

    @After
    public void tearDown()throws Exception{

    }

    @Test(expected = ExceptieCNPInvalid.class)
    public  void getVarstaEroareCaractere(){
        persoana = new Persoana("Mirel", "5fg9000000000");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public  void getLuna13Ziua32(){
        persoana = new Persoana("Mirel", "2991233330000");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public  void getVarstaPerformance(){
        persoana = new Persoana("Mirel", "2991231530000");
        persoana.getVarsta();
    }

    @Test(expected = CNPInexistent.class)
    public  void getVarstaCNPInexistent(){
        persoana = new Persoana("Corina", null);
        persoana.getVarsta();
    }

    @Test
    public  void getVarstaCardinality1(){
        persoana = new Persoana("Ion", "5240101011111");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    public  void getVarstaCardinality0(){
        persoana = new Persoana("Ion", "5250101011111");
        assertEquals(0, persoana.getVarsta());
    }

}