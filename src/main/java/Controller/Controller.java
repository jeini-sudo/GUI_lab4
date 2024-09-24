/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.GUIFrame;
import view.PanelCanvas;

/**
 *
 * @author Jeinier
 */
public class Controller implements ActionListener {
    private GUIFrame guiFrame;
    private PanelCanvas panelCanvas;
    
    public Controller (){
        this.guiFrame = new GUIFrame();
        this.panelCanvas = guiFrame.getPanelCanvas();
        this.guiFrame.listenerButton(this);
        
    }
public void actionPerformed (ActionEvent e){
this.panelCanvas.moveFigure();  
}
   
}
