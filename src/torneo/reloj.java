/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author casho
 */
public class reloj extends javax.swing.JFrame {
    final Timer tiempo;
    int useg=0;
    int dseg=0;
    int umin=0;
    public reloj() {
        this.tiempo = new Timer(1000, actionlistener);
        tiempo.start();
    }

    ActionListener actionlistener= new ActionListener()
    { 
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            System.out.println("Tiempo "+umin+":"+dseg+useg+"\n\r");
            if (useg>=9) {
                useg=0;
                dseg++;
                if (dseg>=6) {
                    dseg=0;
                    umin++;
                    if (umin==3) {
                        tiempo.stop();
                    }
                }
            }
            else {
                useg++;
            }
            
        }
    }; 

}
