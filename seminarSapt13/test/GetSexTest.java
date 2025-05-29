package acs.ase.test;

import acs.ase.clase.Persoana;
import acs.ase.exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetSexTest {

    @Test
    public void getSexRIGHT() {
        Persoana persoana = new Persoana("Ion", "503030313131415");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRIGHT1() {
        Persoana persoana = new Persoana("Ana", "603030313131415");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexRBoundaryInferior() {
        Persoana persoana = new Persoana("Ion", "1980313131415");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRBoundarySuperior() {
        Persoana persoana = new Persoana("Ana", "8980313131415");
        assertEquals("F", persoana.getSex());
    }

    private String getSexParitate(String CNP){
        if(CNP.charAt(0)%2 ==0){
            return "F";
        }
        else {
            return "M";
        }
    }

    @Test
    public void getSexRBoundaryCeck() {
        String CNP = "8980313131415";
        Persoana persoana = new Persoana("Ana", CNP);

        assertEquals(getSexParitate(CNP), persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getSexIncepe9sau0() {
        Persoana persoana = new Persoana("Ana", "9980313131415");
        persoana.getSex();
    }
}