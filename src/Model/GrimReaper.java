package Model;

/**
 * Der Hauptgegner des Spielers. Er wird die harte Arbeit des Spielers, Dinge in Baeume
 * zu verwandeln, erschweren, indem er diese abbrennt oder faellt.
 * @author rukuma,Marvin
 */
public class GrimReaper extends Dynamisch
{
    private int derzeitgeleben=MAX_LEBEN;
    private Koordinaten ziel;
    private boolean zielAmLeben =false; //tmp
    private KannonenKugel verbrenner;
    /**
     *  Konstruktor der Klasse GrimReaper. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     */
    public GrimReaper ( Koordinaten objektPosition)
        {
        super ( objektPosition , GRIMREAPER_BREITE , GRIMREAPER_HOEHE, "Reaper", REAPER_GESCHWINDIGKEIT,START_WINKEL);

        }
   //<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    
    public int getDerzeitgeleben()
    {
        return derzeitgeleben;
    }
    
    public void setDerzeitgeleben(int derzeitgeleben)
    {
        this.derzeitgeleben = derzeitgeleben;
    }
    
    public Koordinaten getZiel()
    {
        return ziel;
    }
    
    public void setZiel(Koordinaten ziel)
    {
        this.ziel = ziel;
    }
    
    public boolean isZielAmLeben()
    {
        return zielAmLeben;
    }
    
    public void setZielAmLeben(boolean zielAmLeben)
    {
        this.zielAmLeben = zielAmLeben;
    }
    
    public KannonenKugel getVerbrenner()
    {
        return verbrenner;
    }
    
    public void setVerbrenner(KannonenKugel verbrenner)
    {
        this.verbrenner = verbrenner;
    }
    
    
//</editor-fold>
    
    /**
     *Diese Methode wird ueberpruefen, ob sich Baeume in der Umgebung
      befinden und anschliessend dort hinfahren.
     * @param that
     */
    public void zielSuchen(Baum that)
    {
        /* wird implementiert sobald die Spieleflaeche da ist.

        */
      
    }
    
    /**
     *Diese Methode macht, dass sich der GrimReaper sich zum Ziel hinbewegt.
     */
    public void zielBewegen()
    {
        if (zielAmLeben == false)
        {
            //"Random" bewegungen ausfuehren.
            super.bewegungAusfuehren();
        }else if(zielAmLeben == true)
        {
            //zum Ziel hinbewegen: wird implementiert wenn die Spieleflaeche da ist.
            verbrennen();
        }

    }
    
    /**
     *Die Waffe des GrimReapers um die Baeume zu vernichten. TMP
     * @return 
     */
    public KannonenKugel verbrennen()
    {
        double missileAngle = this.getBewegungsWinkel();
        Koordinaten missileDirection = Dynamisch.karthesischesKoordinatensystem(missileAngle);

    Koordinaten missileStartPosition = new Koordinaten(this.getObjektPosition().getX(),this.getObjektPosition().getY());           

    KannonenKugel kugel = new KannonenKugel(missileStartPosition, missileAngle,GRIMREAPER_REICHWEITE); 
    zielAmLeben=false;
    return kugel;

    }

 
    @Override
    protected void objektZeichnen (  )
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }




}
        