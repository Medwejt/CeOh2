/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Marvin
 */
public abstract class Dynamisch extends SpieleObjekte 
{
    private double bewegungsWinkel;
    
    private double geschwindigkeit;

    public Dynamisch( Koordinaten objektPosition , double breite , double hoehe, String name,double geschwindigkeit ,double bewegungsWinkel )
    {
        super(objektPosition,breite,hoehe,name);
        this.bewegungsWinkel = bewegungsWinkel;
        this.geschwindigkeit = geschwindigkeit;
    }
//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    
    public double getBewegungsWinkel()
    {
        return bewegungsWinkel;
    }
    
    public void setBewegungsWinkel(double bewegungsWinkel)
    {
        this.bewegungsWinkel = bewegungsWinkel;
    }
    
    public double getGeschwindigkeit()
    {
        return geschwindigkeit;
    }
    
    public void setGeschwindigkeit(double geschwindigkeit)
    {
        this.geschwindigkeit = geschwindigkeit;
    }
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methoden">
    
    /**
     *Umwandlung des Winkels ins karthesische System
     * @param winkel
     * @return
     */
    public static Koordinaten karthesischesKoordinatensystem ( double winkel )
    {
        
        // X-Achse zeigt nach Osten, Y-Achse zeigt nach Sueden beim Zeichnen
        double x = Math.cos ( winkel );
        double y = Math.sin ( winkel );
        
        return new Koordinaten ( x , y );
    }
    
    /**
     *Die Allgemeine Bewegungsmethode fuer alle Objekte
     */
    public void spieleObjekteBewegen ()
    {
        Koordinaten richtung = karthesischesKoordinatensystem ( bewegungsWinkel );
        Koordinaten zwischenSpeicher = new Koordinaten(( this.getObjektPosition().getX() + richtung.getX ()*  geschwindigkeit ),(this.getObjektPosition().getY() + richtung.getY () *  geschwindigkeit ));

        
        this.setObjektPosition(zwischenSpeicher);
    }
    
    /**
     *Diese Methode ruft die Bewegungsmethode auf und fuehrt sie anschließend durch
     */
    public void bewegungAusfuehren()
    {
        spieleObjekteBewegen ();
    }
    
    @Override
    protected void objektZeichnen()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//</editor-fold>
}
