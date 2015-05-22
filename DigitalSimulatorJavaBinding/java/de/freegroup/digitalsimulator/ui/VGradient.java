/*
 * Created on Nov 22, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.freegroup.digitalsimulator.ui;

import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.*;


public class VGradient extends JPanel {

    protected Color innerC, outerC;
  public BufferedImage bimg;
  private int biw, bih;

    public VGradient() {
        setBackground(Color.white);
      innerC = Color.darkGray;
      outerC = Color.lightGray;
     }

  public void paint(Graphics g) 
  {

      Dimension d = getSize();

      Graphics2D g2 = (Graphics2D)g;
      render(d.width, d.height, g2);
 }


    public void render(int w, int h, Graphics2D g2) 
    {
        int w2 = w/2;
        int h2 = h/2;
        g2.setPaint(new GradientPaint(0,0,outerC,w2,0,innerC));
        g2.fillRect(0, 0, w2, h);
        g2.setPaint(new GradientPaint(w2,0,innerC,w,0,outerC));
        g2.fillRect(w2, 0, w, h);
    }


    public static void main(String s[]) {
      JPanel panel = new VGradient();
    
      Frame f = new Frame("Java2D Demo - ");
      f.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {System.exit(0);}
      });
      f.add("Center", panel);
      f.pack();
      f.setSize(new Dimension(500,300));
      f.setVisible(true);
    }

} // End Gradient class
