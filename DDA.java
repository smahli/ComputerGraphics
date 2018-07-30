/*
 * This program is all about Digital Differential Analyzer(DDA)
 * Algorithm for DDA Line drawing is given below
 * 1.Get the input the two end points  (X0,Y0) and (X1,Y2) 
 * 2.Calculate the difference between two points of a straight line
 * 3. dx=X1-X0;
 * 4. dy=Y1-Y0;
 * 5. Identify the number of steps to put pixels
 * 6.if(dx>dy)
 * 7.   steps=absolute(dx);
 * 8.else
 * 9.   steps=absolute(dy);
 *10.Calculate the increment in x and y coordinate
 *11.Xc=dx/steps
 *12.Yc=dy/steps
 *13.Put the pixel by incrementing x and y coordinates accordigly 
 *14.x=x+Xc;
 *15.y=y+Yc;
 *16.x=x1;
 *17.y=y1;
*/

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Shizz
 */
public class DDALine extends Applet {

   
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint (Graphics g){
    double dx,dy,steps,x,y,k;
    double xc,yc;
    double x1=200,y1=500,x2=600,y2=200;
    dx=x2-x1;
    dy=y2-y1;
    if(Math.abs(dx)>Math.abs(dy)){
        steps=Math.abs(dx);
    }
    else
        steps=Math.abs(dy);
    
    xc=(dx/steps);
    yc=(dy/steps);
    x=x1;
    y=y1;
    g.fillOval(200,500,5,5);
    for(k=1;k<=steps;k++){
        x=x+xc;
        y=y+yc;
        g.fillOval((int)x,(int)y,5,5);
    }
    
}
    
}
