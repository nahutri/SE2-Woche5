
public class PCVideospiel extends AbstractVideospiel
{

    public PCVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar, system);

    }

    private int zusatzPreis(int mietTage)
    {
        if (mietTage < 8)
            return 0;
        else
        {
            return (mietTage / 5) * 500;

        }

    }

    @Override
    public int getPreisNachTagen(int anzahlTage)
    {

        return zusatzPreis(anzahlTage) + _BasisPreis;
    }

}
