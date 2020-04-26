import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{

    /**
     * Protokolliert Ausleihe oder Rückgabe in einer Verleihkarte
     * @param ereignis: Ausleihe oder Rückgabe
     * @param verleihkarte
     */
    public static void protokolliere(String ereignis, Verleihkarte verleihkarte)
    {
        //System.out.println("Protokolliert! Ausleihe oder Rückgabe");//5.1.3

        try
        {
            FileWriter protokoll = new FileWriter("./protokoll.xml", true);
            protokoll.write(verleihkarte.getFormatiertenString() + Datum.heute()
                    + "\n " + "-----" + "\n");
            protokoll.close();
        }
        catch (IOException e)
        {

            //e.printStackTrace(); // Eclipse Vorschlag
            e.toString();
        }

    }

}
