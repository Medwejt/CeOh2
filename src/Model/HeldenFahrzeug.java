package Model;

/**
 * Das Heldenfahrzeug wird vom Spieler gesteuert um die Umwelt zu retten.
 *
 * @author rukuma,Marvin
 */
public class HeldenFahrzeug extends Fahrzeug
{

    /**
     * Konstrukter der Klasse HeldenFahrzeug. Es wird einer der Konstruktoren
     * der Superklasse "SpieleObjekte" benutzt.
     *
     * @param objektPosition
     */
    public HeldenFahrzeug(Koordinaten objektPosition)
    {
        super(objektPosition, HELDEN_BREITE, HELDEN_HOEHE, HELDEN_NAME,HELDEN_GESCHWINDIGKEIT,START_WINKEL);
 
    }

    /**
     * Methode um dem Spieler das Schiessen zu ermoeglichen
     *
     * @return
     */
    public KannonenKugel schiessen()
    {
        double missileSize = getBreite() * 0.12;
        double missileAngle = getBewegungsWinkel();
        Koordinaten missileDirection = Dynamisch.karthesischesKoordinatensystem(missileAngle);
        // Die beiden -3.0 durch Kannonenrohrlaenge und derzeitge Richtung ersetzten.
        Koordinaten missileStartPosition = new Koordinaten(this.getObjektPosition().getX(),this.getObjektPosition().getY());           

        KannonenKugel kugel = new KannonenKugel(missileStartPosition, missileAngle,HELDEN_REICHWEITE); 
        return kugel;
    }

    @Override
    protected void objektZeichnen()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //methode Schießen hinzufuegen.
}
