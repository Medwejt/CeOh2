/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Die Kannonenkugel des Spielers um Verschmutzer in Baeume zu verwandeln.
 * @author Marvin
 */
public class KannonenKugel extends Dynamisch 
{    
    
    private int reichweite ;
    
    /**
     * Konstruktor der Klasse KannonenKugel. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param position
     * @param bewegungsWinkel
     * @param reichweite
     */
    public KannonenKugel (Koordinaten position,  double bewegungsWinkel, int reichweite) 
    {
        super(position, KUGEL_HOEHE, KUGEL_HOEHE/3, KUGEL_NAME,KUGEL_GESCHWINDIGKEIT,bewegungsWinkel);
        
        this.reichweite = reichweite;
    }

//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    /**
     * Getter um die derzeitige Reichweite der Kugel zu holen.
     * @return
     */
    public int getReichweite() {
        return reichweite;
    }
    
    /**
     * Setter um die derzeitige Reichweite der Kugel zu holen.
     * @param range
     */
    public void setReichweite(int range) {
        this.reichweite = range;
    }
//</editor-fold>
    
    @Override
    public void bewegungAusfuehren() 
    {
        if (reichweite > 0) 
        {
            super.bewegungAusfuehren();
        }
        reichweite--;
    }


    @Override
    protected void objektZeichnen()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
