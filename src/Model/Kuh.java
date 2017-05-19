package Model;

/**
 *
 * @author rukuma,Marvin
 */
public class Kuh extends Tiere implements Verschmutzer
{

    /**
     * Konstruktor der Klasse Kuh.
     * @param objektPosition
 
     */
    public Kuh ( Koordinaten objektPosition)
        {
        super ( objektPosition , KUH_BREITE , KUH_HOEHE, KUH_NAME, TIERE_GESCHWINDIGKEIT,START_WINKEL );
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
