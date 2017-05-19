/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * "SpieleObjekte" ist die Oberklasse für alle Objekte, die fuer das Spiel
 * benoetigt werden.
 * @author Marvin
 */
public abstract class SpieleObjekte implements Konstanten
{

//<editor-fold defaultstate="collapsed" desc="Eigenschaften">
    
   // private static double gesamtEmission =0;
      
    private final String name;

    private Koordinaten objektPosition;
    
    private double breite;
    
    private double hoehe;
    
    
//    private double ausstoss =0; //Emissionsausstoss, der von Objekten produziert wird.
    
    private int maxLeben;
    
    private int derzeitigesLeben;
    
    //private double wachstumAusstoss = 0;

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Konstruktor">
    
    /**
     * Konstruktor fuer die meisten Objekte die durch die Unterklassen erzeugt werden
     * @param objektPosition ist die derzeitige Position der Objektes
     * @param breite    ist die Breite des Objektes
     * @param hoehe     ist die Hoehe des Objektes
     * @param leben     ist das Leben der Objekte
     * @param name  ist der Name des erstellten Objektes
     */
    public SpieleObjekte ( Koordinaten objektPosition , double breite , double hoehe, String name )
    {
        this.objektPosition = objektPosition;
        this.breite = breite;
        this.hoehe = hoehe;
        this.name = name;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    
        
    public String getName()
    {
        return name;
    }
    
   
    public Koordinaten getObjektPosition()
    {
        return objektPosition;
    }

    public void setObjektPosition(Koordinaten objektPosition)
    {
        this.objektPosition = objektPosition;
    }
    
    
    
    public double getBreite ()
    {
        return breite;
    }
    
    
    public void setBreite ( double breite )
    {
        this.breite = breite;
    }
    
    
    public double getHoehe ()
    {
        return hoehe;
    }
    
    
    public void setHoehe ( double hoehe )
    {
        this.hoehe = hoehe;
    }
    
    
    
    
//</editor-fold>   

//<editor-fold defaultstate="collapsed" desc="Methoden">
    /**
     * Konsolenausgabe fuer die erstellten Instanzen.
     */
    public void beschreibeDich()
    {
        System.out.println("Hallo, mein Name ist: "+this.name+"." );System.out.println("Meine Lebenspunkte: "+ this.derzeitigesLeben);
        System.out.println("Meine Breite: "+ this.breite);
        System.out.println("Meine Hoehe: "+ this.hoehe);
    }
    
     /**
     *Teil der Kollisionsabfrage, die kontrolliert, ob sich etwas links vom Objekt befindet.
     * @param that
     * @return
     */
     public boolean istLinksDavon ( SpieleObjekte that )
    {
        return this.getObjektPosition ().getX () + this.getBreite () < that.getObjektPosition ().getX ();
    }
    
    /**
     *Teil der Kollisionsabfrage die Kontrolliert ob etwas ueber dem Objekt ist.
     * @param that
     * @return
     */
    public boolean istDrueber ( SpieleObjekte that )
    {
        return this.getObjektPosition ().getY () + this.getHoehe () < that.getObjektPosition ().getY ();
    }
    
    /**
     *Komplette Kollisionsabfrage, die kontrolliert, ob das Objekt links von etwas ist
     *oder etwas links vom Objekt ist. Dasselbe wird noch einmal fuer Drueber und Drunter
     *ueberprueft.
     * @param that
     * @return
     */
    public boolean beruehrt ( SpieleObjekte that )
    {
        
        // IstRechtsDavon/Drunter einfügen damit man es Dynamisch machen kann
        if ( this.istLinksDavon ( that ) )
        {
            return false;
        }
        if ( that.istLinksDavon ( this ) )
        {
            return false;
        }
        if ( this.istDrueber ( that ) )
        {
            return false;
        }
        if ( that.istDrueber ( this ) )
        {
            return false;
        }
        
        return true;
    }
   
    /**
     *Temporaere Methode zum Zeichnen das Objekts auf die Spielflaeche.
     */
    protected abstract void objektZeichnen ();
//</editor-fold>

}
