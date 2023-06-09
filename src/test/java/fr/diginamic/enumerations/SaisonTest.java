package fr.diginamic.enumerations;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaisonTest {

    @Test
    public void valueOfLibelle() {
        assertEquals(null,Saison.valueOfLibelle("year"));
        assertEquals(Saison.ETE,Saison.valueOfLibelle("Eté"));
    }

}