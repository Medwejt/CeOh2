/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Marvin
 */
import Model.Baum;
import Model.Dynamisch;
import Model.Elefant;
import Model.GrimReaper;
import Model.Haus;
import Model.HeldenFahrzeug;
import Model.KannonenKugel;
import Model.Kuh;
import Model.SpieleObjekte;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SpieleKonsole
{
    private List<Dynamisch> dynamisch = new ArrayList<>();
    private List<KannonenKugel> kannonenKugel = new ArrayList<>();
    private List<SpieleObjekte> spieleObjekte = new LinkedList<>();
    private Baum baum;
    private HeldenFahrzeug test;
    private Kuh kuh;
    private Elefant elefant;
    private GrimReaper reaper;
    private Haus haus1;
    private Haus haus2;
    private boolean spielVorbei = false;

    public SpieleKonsole()
    {

        initSpiel();
        spielStarten();

    }

    public boolean isSpielVorbei()
    {
        return spielVorbei;
    }

    public void setSpielVorbei(boolean gameOver)
    {
        this.spielVorbei = gameOver;
    }

    private void initSpiel()
    {
        initSpielerAuto();
        spieleobjekteErstellen();
        test();
        //fenster.start();
    }

    private void spieleobjekteErstellen()
    {
        //init
        spieleObjekte.add(test);
        spieleObjekte.add(kuh);
        spieleObjekte.add(elefant);
        spieleObjekte.add(reaper);
        spieleObjekte.add(haus1);

        kannonenKugel.add(test.schiessen());

        //spieleObjekte.get(0).beschreibeDich();
        //kannonenKugel.get(0).beschreibeDich();
        // hier werden wir später die Spielobjekte erzeugen
    }

    private void initSpielerAuto()
    {

      //  test = new HeldenFahrzeug(new Koordinaten(10, 10), 10.0, 5.0, 5.0);

    }

    private void spielStarten()
    {
    }

    public void spielPausieren()
    {
    }

    public void weiterspielen()
    {

    }

    public void neustartSpiel()
    {

        setSpielVorbei(false);
        spieleobjekteErstellen();
        spielStarten();
    }

    private void spielBeenden()
    {
        setSpielVorbei(true);
        spielPausieren();
    }

    private void doOnTick()
    {

        for (Iterator<KannonenKugel> itKugel = kannonenKugel.iterator(); itKugel.hasNext();)
        {
            KannonenKugel kugel = itKugel.next();
            boolean wurdeRemoved = false;
            kugel.bewegungAusfuehren();
            if (kugel.getReichweite() <= 0)
            {
                itKugel.remove();
            }
            for (Iterator<SpieleObjekte> itObjekte = spieleObjekte.iterator(); itObjekte.hasNext();)
            {
                SpieleObjekte objekt = itObjekte.next();
                if (objekt.beruehrt(kugel) && kugel.getReichweite() > 1)
                {
                        if (objekt.getDerzeitigesLeben() > 1)
                        {
                            System.out.println(objekt.getName() + " wurde Getroffen!!!!");
                            objekt.setDerzeitigesLeben(objekt.getDerzeitigesLeben() - 1);
                            kugel.setReichweite(0);
                        } else
                        {
                            System.out.println(objekt.getName() + " wurde Getoetet!!!!");
                            //baum = new Baum(objekt.getObjektPosition(), 1.0, 1.0, 1, 5.0, 5.0);
                            itObjekte.remove();
                            wurdeRemoved = true;
                            kugel.setReichweite(0);
                        }
                    itKugel.remove();
                }
            }
            if (wurdeRemoved)
            {
                spieleObjekte.add(baum);
            }
            for (Iterator<SpieleObjekte> itObjekte = spieleObjekte.iterator(); itObjekte.hasNext();)
            {
                SpieleObjekte objekt = itObjekte.next();

                for (Iterator<Dynamisch> itsObjekte = dynamisch.iterator(); itsObjekte.hasNext();)
                {
                    Dynamisch objekt1 = itsObjekte.next();
                    if (objekt1.equals(objekt))
                    {
                        if (itsObjekte.hasNext())
                        {
                            objekt1 = itsObjekte.next();
                        }
                    } else if (!objekt1.beruehrt(objekt))
                    {
                            objekt1.bewegungAusfuehren();
                        
                    } else if (objekt1.beruehrt(objekt))
                    {
                        System.out.println(objekt1.getName() + " und " + objekt.getName() + " wuerden Kollidieren");
                    }
                }
            }
        }
    }

    private void test()
    {
        doOnTick();
        doOnTick();
    }

}
