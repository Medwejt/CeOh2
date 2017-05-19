package Model;

/**
 * Das Objekt Baum, was aus dieser Klasse erzeugt wird, wird in unserem Spiel 
 * dafuer zustaendig sein den gesamten Emissionwert
 * zu verringern, natuerlich nur solange er nicht brennt.
 * @author rukuma, Marvin
 */
public class Baum extends Pflanzen implements Reiniger , Verschmutzer
{




    /**
     * Konstruktor der Klasse Baum. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition

     */
    public Baum ( Koordinaten objektPosition)
        {
        super ( objektPosition , BAUM_BREITE , BAUM_HOEHE, BAUM_NAME);
        
        }
    

    @Override
    public void co2Reduzieren()
    {
    }
    @Override
    public void co2Produzieren()
    {
    }
    
    /**
     * Diese Methode ueberprueft, ob der Baum brennt, und wird anschliessend die 
     * richtige Methode zum Produzieren oder Reduzieren ausfuehren.
     */
    public void produzieren()
    {
    }
    
    @Override
    protected void objektZeichnen ()
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }
    /**
     *Methode, die die Eigenschaften des erstellten Objektes auf der Konsole ausgibt.
     */



    

}
