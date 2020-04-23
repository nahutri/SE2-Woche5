import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class KonsolenVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private AbstractVideospiel _videoSpiel;
    private KonsolenVideospiel _KonsolenVideospiel;

    @Before
    public void setUp()
    {
        _videoSpiel = getMedium();
        _KonsolenVideospiel = new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _videoSpiel.getMedienBezeichnung());
    }

    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        AbstractVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        AbstractVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

    @Test
    public final void testGetFormatiertenString()
    {
        Medium medium = getMedium();
        assertNotNull(medium.getFormatiertenString());
    }

    @Test
    public void testeMietgebuehr()
    {
        /*      assertEquals(_videoSpiel.berechneMietgebuehr(3), new Geldbetrag(200));
        assertEquals(_videoSpiel.berechneMietgebuehr(7), new Geldbetrag(200));*/

        _KonsolenVideospiel.berechneMietgebuehr(1);

        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(1),
                new Geldbetrag(200));
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(3),
                new Geldbetrag(900));
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(6),
                new Geldbetrag(1600));
        assertEquals(_KonsolenVideospiel.berechneMietgebuehr(9),
                new Geldbetrag(2300));

    }

}
