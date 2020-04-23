
public class KonsolenVideospiel extends AbstractVideospiel
{

    public KonsolenVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar, system);

    }

    private int zusatzPreis(int mietTage)
    {

        return (mietTage / 3) * 700;

    }

    @Override
    public int getPreisNachTagen(int anzahlTage)
    {
        // TODO Auto-generated method stub
        return zusatzPreis(anzahlTage) + _BasisPreis;
    }

}
