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
public interface Konstanten
{
    /*STARTPOSITIONEN
    TO_DO
    STARTPOSITIONEN 
        -MEHRERE STARTPOSITONEN NOETIG SIEHE BAUM1 BAUM2
    BREITE
    HOEHE
    */ 
//<editor-fold defaultstate="collapsed" desc="KONSTANTE_NAMEN">
    public static final String BAUM_NAME ="Baum";
    public static final String ELEFANT_NAME="Elefant";
    public static final String GRIMREAPER_NAME="Grim Reaper";
    public static final String HELDEN_NAME="Helden Fahrzeug";
    public static final String KUH_NAME="Kuh";
    public static final String HAUS_NAME="Haus";
    public static final String KUGEL_NAME="Kugel";
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="KONSTANTE_GESCHWINDIGKEIT">
    
    public static final double TIERE_GESCHWINDIGKEIT = 1;
    public static final double REAPER_GESCHWINDIGKEIT = 4;
    public static final double HELDEN_GESCHWINDIGKEIT = 3;
    public static final double KUGEL_GESCHWINDIGKEIT =5;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="KONSTANTE_GROESSEN">
    public static final double KUH_HOEHE=2;
    public static final double KUH_BREITE=2;
    public static final double BAUM_HOEHE=2;
    public static final double BAUM_BREITE=2;
    public static final double ELEFANT_HOEHE=2;
    public static final double ELEFANT_BREITE=2;
    public static final double GRIMREAPER_HOEHE=2;
    public static final double GRIMREAPER_BREITE=2;
    public static final double HAUS_HOEHE=2;
    public static final double HAUS_BREITE=2;
    public static final double HELDEN_HOEHE=2;
    public static final double HELDEN_BREITE=2;
    public static final double KUGEL_HOEHE=2;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="KONSTANTE_STARTPOSITION">

    public static final Koordinaten BAUM1_STARTPOSITION=new Koordinaten(5,5);
    public static final Koordinaten BAUM2_STARTPOSITION=new Koordinaten(5,5);
    public static final Koordinaten HAUS_STARTPOSITION=new Koordinaten(5,5);
    public static final Koordinaten HELD_STARTPOSITION=new Koordinaten(5,5);
    public static final Koordinaten GRIMREAPER_STARTPOSITION=new Koordinaten(5,5);
    public static final Koordinaten KUH_STARTPOSITION=new Koordinaten(5,5);
    public static final Koordinaten ELEFANT_STARTPOSITION=new Koordinaten(5,5);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="KONSTANTE_MISC">
    public static final int MAX_LEBEN =3;
    public static final double START_WINKEL = 0;
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="KUGEL_REICHWEITE">
    public static final int GRIMREAPER_REICHWEITE=1;
    public static final int HELDEN_REICHWEITE=100;
    
//</editor-fold>
}
