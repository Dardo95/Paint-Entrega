/*
La clase triangulo permite almacenar un triangulo
además de su posición en la pantalla, si está relleno o no,
su color etc
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Dardo Nogueira
 */
public class Triangulo extends Polygon{
    
    //color
    public Color color = null;
    //relleno
    public boolean relleno = false;
 
    
    public Triangulo (int _x, int _y, int _width,  Color _color, boolean _relleno){
        //numero de puntos
        this.npoints = 3;
        
        //los puntos de la figura
        this.xpoints[0] = _x ;
        this.ypoints[0] = _y - _width/2; 

        this.xpoints[1] = _x + _width/2;
        this.ypoints[1] = _y + _width/2;
 
        this.xpoints[2] = _x - _width/2;
        this.ypoints[2] = _y + _width/2;
        
        this.color = _color;
        this.relleno = _relleno;
        
    }
    
        //pinta y colorea la figura
        public void pintaYColorea(Graphics2D g2){
            g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
}
