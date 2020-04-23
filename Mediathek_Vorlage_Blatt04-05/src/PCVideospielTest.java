import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class PCVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private AbstractVideospiel _videoSpiel;
    private PCVideospiel _PCVideospiel;

    @Before
    public void setUp()
    {
        _videoSpiel = getMedium();
        _PCVideospiel = new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
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

    protected AbstractVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
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

        assertEquals(_PCVideospiel.berechneMietgebuehr(1), new Geldbetrag(200));
        assertEquals(_PCVideospiel.berechneMietgebuehr(8), new Geldbetrag(700));
        assertEquals(_PCVideospiel.berechneMietgebuehr(13),
                new Geldbetrag(1200));
        assertEquals(_PCVideospiel.berechneMietgebuehr(18),
                new Geldbetrag(1700));

    }

}
