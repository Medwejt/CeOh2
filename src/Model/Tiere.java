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
public class Tiere extends Dynamisch
{
    public Tiere ( Koordinaten objektPosition , double breite , double hoehe, String name, double geschwindigkeit, double bewegungsWinkel)
        {
        super ( objektPosition , breite , hoehe, name, geschwindigkeit,bewegungsWinkel );
        }
}
