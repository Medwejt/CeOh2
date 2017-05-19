package Model;

/**
 * Die Klasse Haus wird Objekte erzeugen, die ein Co2 Produzent sind,
 * sich aber nicht bewegen koennen.
 * @author rukuma,Marvin
 */
public class Haus extends Gebaeude implements Verschmutzer
{

    /**
     * Konstruktor der Klasse Haus. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     */
    public Haus( Koordinaten objektPosition)
        {
        super ( objektPosition , HAUS_BREITE , HAUS_HOEHE, HAUS_NAME );
        }

    @Override
    protected void objektZeichnen (  )
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }


    @Override
    public void co2Produzieren ()
        {
        }

}
