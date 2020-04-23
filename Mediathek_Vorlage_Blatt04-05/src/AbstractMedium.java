
public abstract class AbstractMedium
{
    protected String _titel;
    protected String _kommentar;

    public AbstractMedium(String titel, String kommentar)
    {
        _titel = titel;
        _kommentar = kommentar;
    }

    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + "\n" + "Titel" + _titel + "Kommentar"
                + _kommentar;
    }

    public abstract String getMedienBezeichnung();

    /**
     * Gibt den Kommentar zurück
     * @return _kommentar
     */
    public String getKommentar()
    {
        return _kommentar;
    }

    /**
     * Setzt den Kommentar
     * @param kommentar
     * 
     * @require kommentar !=null
     * 
     * @ensure getKommentar()==kommentar
     */
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: null";
        _kommentar = kommentar;
    }

    /**
     * Gibt den Titel zurück
     * @return _titel
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Setzt den Titel
     * @param titel zum Medium
     * 
     * @require titel != null
     * 
     *  @ensure getTitel()==titel
     */
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: null";
        _titel = titel;
    }

}
