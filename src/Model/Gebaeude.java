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
public abstract class Gebaeude extends Statisch
{
    public Gebaeude( Koordinaten objektPosition , double breite , double hoehe,String name)
        {
        super ( objektPosition , breite , hoehe, name);
        }
 
}
