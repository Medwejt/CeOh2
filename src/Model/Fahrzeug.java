package Model;

/**
 * Fahrzeug wird computergesteuerte Autos, die Co2 produzieren, erstellen.
 * @author rukuma,Marvin
 */
public class Fahrzeug extends Dynamisch implements Verschmutzer
{

    /**
     * Konstruktor der Klasse Fahrzeug. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     * @param geschwindigkeit
     */
    public Fahrzeug ( Koordinaten objektPosition , double breite , double hoehe,String name, double geschwindigkeit,double bewegungsWinkel)
        {
        super ( objektPosition , breite , hoehe, name ,geschwindigkeit,bewegungsWinkel );

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
