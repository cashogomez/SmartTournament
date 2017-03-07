/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

/**
 *
 * @author casho
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;


/** @see http://stackoverflow.com/questions/3951383 */
public class Torneo extends JDesktopPane {

    private static final Stroke s = new BasicStroke(4.0f);

    public Torneo() {
        this.setPreferredSize(new Dimension(1024, 768));
    }
    private void lineaVertical (MyFrame one, MyFrame two,Graphics g ) {

        // Linea vertical ********************************************
        
        Graphics2D g2d = (Graphics2D) g;
        int x1 = one.getX() + one.getWidth()+100;
        int y1 = one.getY() + one.getHeight() / 2;
        int x2 = two.getX() + two.getWidth()+100;
        int y2 = two.getY() + two.getHeight() / 2;
        g2d.drawLine(x1, y1, x2, y2);        
    }
    
   private void lineaHorizontal (MyFrame two, Graphics g) { 
    // Linea horizontal abajo
        Graphics2D g2d = (Graphics2D) g;        
        int x1 = two.getX() + two.getWidth();
        int y1 = two.getY() + two.getHeight()/2;
        int x2 = two.getX() + two.getWidth()+100;
        int y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
   }
    private MyFrame lineaHorizontalGanador (MyFrame one, MyFrame two, MyFrame Ganador, Graphics g) { 
        
        // Dibuja la linea del competidor Inferior
        Graphics2D g2d = (Graphics2D) g; 
        int x1 = two.getX() + two.getWidth();
        int y1 = two.getY() + two.getHeight()/2;
        int x2 = two.getX() + two.getWidth()+100;
        int y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        
        // Dibuja la linea del competidor Inferior

        x1 = one.getX() + one.getWidth();
        y1 = one.getY() + one.getHeight()/2;
        x2 = one.getX() + one.getWidth()+100;
        y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        
        // Dibuja linea vertical entre competidor superior e inferior
        x1 = one.getX() + one.getWidth()+100;
        y1 = one.getY() + one.getHeight() / 2;
        x2 = two.getX() + two.getWidth()+100;
        y2 = two.getY() + two.getHeight() / 2;
        g2d.drawLine(x1, y1, x2, y2);        
        
        
    // Linea horizontal abajo   
        x1 = two.getX() + two.getWidth()+100;
        y1 = ((one.getY() + one.getHeight()/2))+((two.getY() + two.getHeight()/2)-(one.getY() + one.getHeight()/2))/2;
        x2 = two.getX() + two.getWidth()+200;
        y2 = y1;
        g2d.drawLine(x1, y1, x2, y2);
        Ganador = new MyFrame(Ganador.ConseguirNombre(), Ganador.ConseguirEtiqueta(),x2, y1-(70/2));
        return Ganador;
     //  Este bloque es necesario este junto para que los valores retornados sean congruentes   
   }   
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.lightGray);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setColor(Color.blue);
        g2d.setStroke(s);
        
        // ***************** DIbujando lineas y elementos *****************
        MyFrame one = new MyFrame("Densho Juko Sur","Hugo Ramirez Pérez", 100, 100);
        one.setBackground(Color.PINK);
        MyFrame two = new MyFrame("Juan Luis Vives", "Antonio Ortega Galván",100, 200);
        MyFrame one1 = new MyFrame("Densho Juko Sur","Karen Rodriguez ", 100, 300);
        MyFrame two2 = new MyFrame("Juan Luis Vives", "Oscar Hernandez",100, 400);
        this.add(one);
        this.add(two);
        this.add(one1);
        this.add(two2);
        // ***************** Primeras conexiones del nodo 1
        lineaHorizontal(one, g);
        lineaHorizontal (two, g);
        lineaVertical (one, two,g );
        
        // ***************** Segundo conexiones del nodo 2
        lineaHorizontal(one1, g);
        lineaHorizontal(two2, g);
        lineaVertical (one1, two2,g );
        
        // ***************Linea Ganador ***************
        //MyFrame Ganador =lineaHorizontalGanador (one, two, two, g);
        //this.add(Ganador);
            MyFrame Ganador2 =lineaHorizontalGanador (one1, two2, one1, g);
            this.add(Ganador2);
        
        
        //MyFrame Ganador3 =lineaHorizontalGanador (Ganador, Ganador2, Ganador, g);
        //this.add(Ganador3);
        
    }

    private final class MyFrame extends JInternalFrame {
        public String Nombre;
        public String Etiqueta;
        public char Ganado =0;
        
        MyFrame(String name, String Etiqueta, int x, int y) {
            super(name);
            this.Nombre = name;
            this.Etiqueta = Etiqueta;


            // Tamaño de letra
            float tamano = 15;
            // ***************************
            this.setSize(220, 70);
            this.setLocation(x, y);
            //        CONFIGURACION de tamaño de leta de mensajes
            JLabel Mensaje = new JLabel(Etiqueta);
            Font font = Mensaje.getFont();
            font = font.deriveFont(tamano);
            Mensaje.setFont(font);
            // **********************************************************
            this.setVisible(true);
            
            this.add (Mensaje);
            this.addComponentListener(new ComponentAdapter() {

                @Override
                public void componentMoved(ComponentEvent e) {
                    Torneo.this.repaint();
                }
            });
        }
        String ConseguirNombre() {
            return Nombre;
        }
        String ConseguirEtiqueta(){
            return Etiqueta;
        }
    }

    private void display() {
        JFrame f = new JFrame("EJemplo de Gráficas");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(this);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Torneo().display();
            }
        });
    }
}