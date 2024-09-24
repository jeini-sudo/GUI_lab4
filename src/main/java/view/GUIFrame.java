/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jeinier
 */
public class GUIFrame extends JFrame{
    
    private PanelCanvas panelCanvas;
    private JButton btnMove;
 public GUIFrame (){
     
     this.panelCanvas = new PanelCanvas();
     this.btnMove = new JButton ("mover en x");
 
 this.setSize(500, 500);
 this.setTitle("Laboratorio 4");
 this.setVisible(true);
 
 this.add(panelCanvas,BorderLayout.CENTER);
 this.add(btnMove, BorderLayout.SOUTH);
 }
    public GUIFrame (String Titulo, int ancho, int alto){
        this.setSize(ancho, alto);
        this.setTitle(Titulo);
        this.setVisible(true);
        
    }
    public void listenerButton(ActionListener controller){
        this.btnMove.addActionListener(controller);
        
        
    }
    public PanelCanvas getPanelCanvas (){
        return this.panelCanvas;   
    }
}
