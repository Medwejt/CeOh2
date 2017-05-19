package Model;


/**
 * Der Elefant ist einer unserer Wildtiere, das in unsere Spielewelt umher zieht
 * und Co2 produziert.
 *
 * @author rukuma,Marvin
 */
public class Elefant extends Tiere implements Verschmutzer
{
   
    /**
     * Konstruktor der Klasse Elefant. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition

     */
    public Elefant ( Koordinaten objektPosition)
        {
        super ( objektPosition , ELEFANT_BREITE , ELEFANT_HOEHE, ELEFANT_NAME, TIERE_GESCHWINDIGKEIT, START_WINKEL);
        }

    @Override
    protected void objektZeichnen ()
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }


    @Override
    public void co2Produzieren()
    {
       
    }

    /**
     *Methode, die die Eigenschaften des erstellten Objektes auf der Konsole ausgibt.
    */
 
}
