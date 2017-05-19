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
public abstract class Statisch extends SpieleObjekte
{
   public Statisch ( Koordinaten objektPosition , double breite , double hoehe, String name )
    {
        super(objektPosition , breite , hoehe, name);
    
    } 

    @Override
    protected void objektZeichnen()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
