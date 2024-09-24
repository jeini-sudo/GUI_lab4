/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Jeinier
 */
public class PanelCanvas extends JPanel {
    private int x;
    private int y;
    
    public PanelCanvas (){
        this.x = 20;
        this.y = 20;
 
    }
    
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillOval(this.x, this.y, 20 , 20);
        
        
        
    }
    public void moveFigure (){
        int moveDistance = 10;
        int figureSize = 20;
        
        if (x+moveDistance + figureSize <= getWidth()){
            x+= moveDistance;
        }else {
            x = getWidth()-figureSize;
        }
      repaint();  
        
    }
}
